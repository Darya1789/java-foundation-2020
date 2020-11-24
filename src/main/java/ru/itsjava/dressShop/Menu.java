package ru.itsjava.dressShop;

import java.util.Scanner;

public class Menu {
    private final Scanner console = new Scanner(System.in);
    private Catalog catalog = new Catalog(new Dress[0], console);
    private Cart cart = new Cart(catalog, new Dress[0], console);
    private DressesList listCatalog = new DressesList(catalog.getItemsDresses(), console);
    private DressesList listCart = new DressesList(cart.getItemsCart(), console);


    public void start() {
        printMenu();

        while (true) {
            System.out.println("\nВведите номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printMenu();
            } else if (menuNum == 2) {
                listCatalog.printItems();
            } else if (menuNum == 3) {
                listCatalog.addItemsToCatalog();
            } else if (menuNum == 4) {
                listCatalog.delItem();
            } else if (menuNum == 5) {
                listCatalog.seletionSort();
            } else if (menuNum == 6) {
                listCatalog.isDressInShop(catalog.getItemsDresses(), null);
            } else if (menuNum == 7) {
                listCart.addItemsToCat(catalog.getItemsDresses());
            } else if (menuNum == 8) {
                listCart.printItems();
            } else if (menuNum == 9) {
                listCart.seletionSort();
            } else if (menuNum == 10) {
                listCart.delItem();
            } else if (menuNum == 0) {
                System.out.println("Приходите еще!");
                System.exit(0);
            }
        }

    }

    private void printMenu() {
        System.out.println(" Mеню:\n" +
                " 1. Посмотреть меню\n" +
                " 2. Посмотреть все платья\n" +
                " 3. Добавить платье\n" +
                " 4. Купить\n" +
                " 5. Отортировать по алфавиту\n" +
                " 6. Определить наличие товара в магазине\n" +
                " 7. Отложить товар в корзину\n" +
                " 8. Посмотреть корзину\n" +
                " 9. Отсортировать корзину\n" +
                " 10. Удалить из корзины\n" +
                " 0. Выход");
    }


}

