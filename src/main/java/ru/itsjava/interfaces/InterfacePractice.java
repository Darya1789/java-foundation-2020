package ru.itsjava.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();
        System.out.println("Creatable.LIFE = " + Creatable.LIFE);

    }
}
