package ru.itsjava.homework.interfaces;

public class Dog implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Бегу высунув язык");
    }

    @Override
    public int maxRunDistance() {
        return 150;
    }

    @Override
    public void swim() {
        System.out.println("Плыву по собачьи");
    }

    @Override
    public double maxSwimSpeed() {
        return 9;
    }

    @Override
    public void walk() {
        System.out.println("Вышел на прогулку и в туалет");
    }
}
