package ru.itsjava.homework.interfaces;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Плыву по делам");
    }

    @Override
    public double maxSwimSpeed() {
        return 35;
    }
}
