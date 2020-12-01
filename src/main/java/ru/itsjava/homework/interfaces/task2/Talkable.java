package ru.itsjava.homework.interfaces.task2;

public interface Talkable {
    default void talk() {
        System.out.println("Just speaking!");
    }
}
