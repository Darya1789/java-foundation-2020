package ru.itsjava.homework.collection.list;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private String name;
    private boolean isMale;
    private int age;

    public Person(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    @Override
    public String toString() {
        return " {" + name + ", " + age + "} ";
    }
}
