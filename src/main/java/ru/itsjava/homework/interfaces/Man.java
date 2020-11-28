package ru.itsjava.homework.interfaces;

public class Man implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Я бегу на двух ногах!");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("Я плыву кролем");
    }

    @Override
    public double maxSwimSpeed() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Я просто гуляю по парку");
    }
}
