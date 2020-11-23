package ru.itsjava.dressShop;

import java.util.Scanner;

public class Menu {
    private final Scanner console = new Scanner(System.in);
    private Catalog catalog = new Catalog(new ShopItems[0], console);
    private Cart cart = new Cart(new ShopItems[0], console);


    public void start() {
        printMenu();
        while (true) {
            System.out.println("\nВведите номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                catalog.printItems();
            } else if (menuNum == 2) {
                catalog.addItems();
            } else if (menuNum == 3) {
                catalog.delItem();
            } else if (menuNum == 4) {
                catalog.seletionSort();
            } else if (menuNum == 5) {
                catalog.isDressInShop(null);
            } else if (menuNum == 6) {
                cart.addItems(catalog.getItems());
            } else if (menuNum == 7) {
                cart.printItems();
            } else if (menuNum == 0) {
                System.out.println("Приходите еще!");
                System.exit(0);
            }
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


}

