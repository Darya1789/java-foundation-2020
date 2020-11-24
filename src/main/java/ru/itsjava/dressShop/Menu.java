package ru.itsjava.dressShop;

import java.util.Scanner;

public class Menu {
    private final Scanner console = new Scanner(System.in);
    private Catalog catalog = new Catalog(new Dress[0], console);
    private Cart cart = new Cart(catalog, new Dress[0], console);
    private DressesList list = new DressesList();


    public void start() {
        printMenu();

        while (true) {
            System.out.println("\nВведите номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printMenu();
            } else if (menuNum == 2) {
                list.printItems(catalog.getItemsDresses());
            } else if (menuNum == 3) {
                catalog.setItemsDresses(list.addItemsToCatalog(catalog, console));
            } else if (menuNum == 4) {
                catalog.setItemsDresses(list.delItem(catalog.getItemsDresses(), console));
            } else if (menuNum == 5) {
                list.seletionSort(catalog.getItemsDresses());
            } else if (menuNum == 6) {
                list.isDressInShop(catalog.getItemsDresses(), null, console);
            } else if (menuNum == 7) {
                list.addItemsToCat(catalog, cart, console);
            } else if (menuNum == 8) {
                list.printItems(cart.getItemsCart());
            } else if (menuNum == 9) {
                list.seletionSort(cart.getItemsCart());
            } else if (menuNum == 10) {
                cart.setItemsCart(list.delItem(cart.getItemsCart(), console));
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

