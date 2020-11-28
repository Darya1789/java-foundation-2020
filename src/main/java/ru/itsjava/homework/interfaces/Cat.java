package ru.itsjava.homework.interfaces;

public class Cat implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Бегу за птичкой");
    }

    @Override
    public int maxRunDistance() {
        return 170;
    }

    @Override
    public void swim() {
        System.out.println("Случайно упала в воду, скорее бы на берег");
    }

    @Override
    public double maxSwimSpeed() {
        return 8;
    }

    @Override
    public void walk() {
        System.out.println("Вышла полежать на солнышке");
    }
}
