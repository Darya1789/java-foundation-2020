package ru.itsjava.homework.interfaces;

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
      //  Person sasha = new Person("Саша", "Иванов", 25);
        //Person sasha = new Person("Саша", "Иванов", 25);
        //Person[] men = new Person[]{}


    }
}
