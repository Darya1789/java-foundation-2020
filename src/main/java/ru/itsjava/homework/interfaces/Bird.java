package ru.itsjava.homework.interfaces;

public class Bird implements Flyable, Swimable, Walkable {
    @Override
    public void fly() {
        System.out.println("Летаю над крышами");
    }

    @Override
    public String sing() {
        return "Чик-чирик";
    }

    @Override
    public void swim() {
        System.out.println("Купаюсь в песке");
    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Клюю зернышки");
    }
}
