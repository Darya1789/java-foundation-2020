package ru.itsjava.dressShop;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Catalog {
    private ShopItems[] items = new ShopItems[0];
    private Scanner console = new Scanner(System.in);

    public Catalog() {
    }


    public void start() {
        printMenu();
        while (true) {
            System.out.println("\nВведите номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printItems();
            } else if (menuNum == 2) {
                addItems();
            } else if (menuNum == 3) {
                delItem();
            }
            //else if (menuNum == 4) {
//                seletionSort(items);
//            } else if (menuNum == 5) {
//                isDressInShop(items, null, console);
//            } else if (menuNum == 6) {
//                cart = addToCart(items, cart, console);
//            } else if (menuNum == 7) {
//                printCart(cart);
//            } else if (menuNum == 0) {
//                System.out.println("Приходите еще!");
//                System.exit(0);
//            }
        }
    }

    private void printMenu() {
        System.out.println(" Mеню:\n" +
                " 1. Посмотреть все платья\n" +
                " 2. Добавить платье\n" +
                " 3. Купить\n" +
                " 4. Отортировать по алфавиту\n" +
                " 5. Определить наличие товара в магазине\n" +
                " 6. Отложить товар в корзину\n" +
                " 0. Выход");
    }

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


    private void delItem() {
        System.out.println("Введите платье, которое вы купили: ");
        String inputDress = console.next();

        if (!isDressInShop(inputDress)) {
            System.out.println("Такого платья нет в магазине. Выберите другой!");
        }
        ShopItems[] newItems = new ShopItems[items.length - 1];
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
        items = newItems;
    }

    private boolean isDressInShop(String dress) {

        String inputDress;
        if (dress == null) {
            System.out.println("Введите платье, наличие которого нужно уточнить:");
            inputDress = console.next();
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
        if (console != null) {
            if (isExist) {
                System.out.println("Все отлично, данный тип платья есть в нашем магазине.");

            } else {
                System.out.println("К сожалению данного типа платья нет в нашем магазине!");
            }
        }
        return isExist;
    }

}
