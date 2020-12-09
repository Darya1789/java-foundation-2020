package ru.itsjava.classwork.inheritance;

public interface Controllable {
    default void move() {
        System.out.println("Move from Controllable");
    }
}
