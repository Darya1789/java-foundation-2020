package ru.itsjava.classwork.dressShop;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Cart {
    private Catalog Dresses;
    private Dress[] itemsCart;
    private Scanner console;

    public Cart(Catalog Dresses, Dress[] itemsCart, Scanner console) {
        this.Dresses = Dresses;
        this.itemsCart = itemsCart;
        this.console = console;
    }




}
