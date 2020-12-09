package ru.itsjava.classwork.inheritance;

public interface Movable {
    default void move() {
        System.out.println("I move");
    }
}
