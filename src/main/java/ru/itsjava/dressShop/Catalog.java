package ru.itsjava.dressShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
@AllArgsConstructor
public class Catalog {
    private ShopItems[] items;
    private Scanner console;

    public void printItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].toString());
        }
    }


    public void addItems() {
        System.out.println("Какое платье добавить в каталог?");
        String typeNewDress = console.next();
        System.out.println("Какая длина платья?");
        String lengthDress = console.next();
        System.out.println("Сколько будет стоить?");
        double priceDress = console.nextDouble();
        ShopItems[] newItems = new ShopItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        if (typeNewDress.equalsIgnoreCase("Свадебное")) {
            ShopItems newDress = new WeddingDress(priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            items = newItems;
        } else if (typeNewDress.equalsIgnoreCase("Выпускное")) {
            System.out.println("Какого цвета платье?");
            String colorDress = console.next();
            ShopItems newDress = new PromDress(colorDress, priceDress, lengthDress);
            newItems[newItems.length - 1] = newDress;
            items = newItems;
        } else {
            System.out.println("Вы не можете добавить данный тип платье, так как такие платья у нас не продаются!");

        }

    }


    public void delItem() {
        System.out.println("Введите платье, которое вы купили: ");
        String inputDress = console.next();

        if (!isDressInShop(inputDress)) {
            System.out.println("Такого платья нет в магазине. Выберите другой!");
        }
        ShopItems[] newItems = new ShopItems[items.length - 1];
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
        items = newItems;
    }

    public boolean isDressInShop(String dress) {

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
        for (ShopItems item : items) {
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

    public void seletionSort() {

        for (int i = 0; i < items.length; i++) {
            int minElem = i;
            for (int j = 1 + i; j < items.length; j++) {
                if (items[j].getType().charAt(0) < items[minElem].getType().charAt(0)) {
                    minElem = j;
                }
            }
            ShopItems temp = items[i];
            items[i] = items[minElem];
            items[minElem] = temp;
        }
    }



}
