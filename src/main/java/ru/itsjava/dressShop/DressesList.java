package ru.itsjava.dressShop;

import java.util.Scanner;

public class DressesList {


    public void printItems(Dress[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
        }
    }


    public Dress[] addItemsToCatalog(Catalog catalog, Scanner console) {
        System.out.println("Какое платье добавить в каталог?");
        String typeNewDress = console.next();
        System.out.println("Какая длина платья?");
        String lengthDress = console.next();
        System.out.println("Сколько будет стоить?");
        double priceDress = console.nextDouble();
        Dress[] newItems = new Dress[catalog.getItemsDresses().length + 1];
        for (int i = 0; i < catalog.getItemsDresses().length; i++) {
            newItems[i] = catalog.getItemsDresses()[i];
        }
        if (typeNewDress.equalsIgnoreCase("Свадебное")) {
            Dress newDress = new WeddingDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            return newItems;
        } else if (typeNewDress.equalsIgnoreCase("Выпускное")) {
            Dress newDress = new PromDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            return newItems;
       } else if (typeNewDress.equalsIgnoreCase("Детское")) {
            Dress newDress = new ChildrenDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            return newItems;
       } else if (typeNewDress.equalsIgnoreCase("Спортивное")) {
            Dress newDress = new SportDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            return newItems;
       } else if (typeNewDress.equalsIgnoreCase("Вязанное")) {
            Dress newDress = new KnittedDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            return newItems;

        } else {
            System.out.println("Вы не можете добавить данный тип платье, так как такие платья у нас не продаются!");
        }
        return catalog.getItemsDresses();

    }


    public Dress[] delItem(Dress[] items, Scanner console) {
        System.out.println("Введите платье, которое вы купили: ");
        String inputDress = console.next();

        if (!isDressInShop(items, inputDress, null)) {
            System.out.println("Такого платья нет в магазине. Выберите другой!");
            return items;
        } else {
            Dress[] newItems = new Dress[items.length - 1];
            if (newItems.length != 0) {
                int index = -1;
                for (int i = 0; i < items.length; i++) {
                    if (items[i].getType().equalsIgnoreCase(inputDress)) {
                        index = i;
                        break;
                    }
                    newItems[i] = items[i];
                }
                for (int i = index; i < newItems.length; i++) {
                    newItems[i] = items[i + 1];
                }
            }
            return newItems;
        }
    }

    public boolean isDressInShop(Dress[] items, String dress, Scanner console) {

        String inputDress;
        boolean flagConsole = false;
        if (dress == null) {
            System.out.println("Введите платье, наличие которого нужно уточнить:");
            inputDress = console.next();
            flagConsole = true;

        } else {
            inputDress = dress;
        }

        boolean isExist = false;
        for (Dress item : items) {
            if (item.getType().equalsIgnoreCase(inputDress)) {
                isExist = true;
                break;
            }
        }
        if (flagConsole) {
            if (isExist) {
                System.out.println("Все отлично, данный тип платья есть в нашем магазине.");

            } else {
                System.out.println("К сожалению данного типа платья нет в нашем магазине!");
            }
        }
        return isExist;
    }

    public void seletionSort(Dress[] items) {

        for (int i = 0; i < items.length; i++) {
            int minElem = i;
            for (int j = 1 + i; j < items.length; j++) {
                if (items[j].getType().charAt(0) < items[minElem].getType().charAt(0)) {
                    minElem = j;
                }
            }
            Dress temp = items[i];
            items[i] = items[minElem];
            items[minElem] = temp;
        }
    }


    public void addItemsToCat(Catalog catalog, Cart cart, Scanner console) {
        System.out.println("Какое платье добавить в корзину?");
        String typeNewDress = console.next();
        isDressInShop(catalog.getItemsDresses(), typeNewDress, null);
        int index = -1;
        Dress[] newItems = new Dress[cart.getItemsCart().length + 1];
        for (int i = 0; i < cart.getItemsCart().length; i++) {
            newItems[i] = cart.getItemsCart()[i];
        }
        for (int i = 0; i < catalog.getItemsDresses().length; i++) {
            if (catalog.getItemsDresses()[i].getType().equalsIgnoreCase(typeNewDress)) {
                index = i;
            }
        }
        newItems[newItems.length - 1] = catalog.getItemsDresses()[index];
        cart.setItemsCart(newItems);
    }
}
