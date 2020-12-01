package ru.itsjava.homework.interfaces.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cow implements Talkable, Eatable {
    public final String name;

    @Override
    public void eat() {
        System.out.println("Cow " + name + " eat a grass!");
    }

    @Override
    public void talk() {
        System.out.println("Cow " + name + " says 'Muuu'");
    }
}
