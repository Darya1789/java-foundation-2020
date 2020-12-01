package ru.itsjava.homework.interfaces.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Man implements Talkable, Eatable{
    private final String name;
    private int age;

    @Override
    public void eat() {
        System.out.println(name + "eats food");
    }

    @Override
    public void talk() {
        System.out.println(name + "says 'Hello!'");
    }
}
