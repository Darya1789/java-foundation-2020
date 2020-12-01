package ru.itsjava.homework.interfaces.task2;

public interface Eatable {
    default void eat() {
        System.out.println("Just eating!");
    }
}
