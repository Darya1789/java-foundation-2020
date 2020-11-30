package ru.itsjava.homework.interfaces;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Задание 1, 2.
        System.out.println("\nЗадание 1, 2.");
        Man man = new Man();
        man.run();

        Bird vorobei = new Bird();
        vorobei.swim();
        vorobei.walk();



        // Задание 3.
        System.out.println("\nЗадание 3.");
        Vodka smirnov = new Vodka("Смирнов", 0.7, "Россия");
        smirnov.drinkTooMuch("Смирнов");

        // Задание 4.
        System.out.println("\nЗадание 4.");
        Person sasha = new Person("Саша", "Иванов", 25);
        Person sasha2 = new Person("Саша", "Иванов", 28);
        Person dasha = new Person("Даша", "Сидорова", 25);
        Person masha = new Person("Маша", "Иванов", 25);
        Person[] men = new Person[]{masha, sasha2, dasha, sasha};
        System.out.println("Before");
        System.out.println("men = " + Arrays.toString(men));
        System.out.println("After");
        Arrays.sort(men);
        System.out.println("men = " + Arrays.toString(men));


    }
}
