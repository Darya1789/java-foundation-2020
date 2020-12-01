package ru.itsjava.homework.interfaces.task2;

public class Main {
    public static void main(String[] args) {


        Cow cow = new Cow("Mashka");
        Man man = new Man("Sasha", 18);
        Plant plant = new Plant("Grass");
        cow.talk();
        cow.eat();
        plant.eat();
        plant.talk();

    }
}
