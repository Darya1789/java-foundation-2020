package ru.itsjava.homework.interfaces.task2;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Plant implements Talkable, Eatable{
    private final String name;

    @Override
    public void eat() {
        System.out.println("Plants " + name + " eat oxygen");
    }
}
