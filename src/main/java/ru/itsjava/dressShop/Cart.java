package ru.itsjava.dressShop;

import java.util.Scanner;

public class Cart extends Catalog {

    public Cart(ShopItems[] items, Scanner console) {
        super(items, console);
    }


    public void addItems(ShopItems[] catalogItems) {
        System.out.println("Какое платье добавить в корзину?");
        String typeNewDress = super.getConsole().next();
        super.isDressInShop(typeNewDress);
        int index = -1;
        ShopItems[] newItems = new ShopItems[super.getItems().length + 1];
        for (int i = 0; i < super.getItems().length; i++) {
            newItems[i] = super.getItems()[i];
        }
        for (int i = 0; i < catalogItems.length; i++) {
            if (catalogItems[i].getType().equalsIgnoreCase(typeNewDress)) {
                index = i;
            }
        }
        newItems[newItems.length - 1] = catalogItems[index];
        super.setItems(newItems);
    }


}
