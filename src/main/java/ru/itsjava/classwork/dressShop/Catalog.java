package ru.itsjava.classwork.dressShop;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter

public class Catalog {
    private Dress[] itemsDresses;
    private Scanner console;

    public Catalog(Dress[] itemsDresses, Scanner console) {
        this.itemsDresses = itemsDresses;
        this.console = console;
    }
}
