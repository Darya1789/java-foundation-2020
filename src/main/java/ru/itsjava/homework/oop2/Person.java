package ru.itsjava.homework.oop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Person {
    protected boolean isMale;
    protected String name;
    protected int age;

    public Person() {
        System.out.println("Человек");
    }

    public void printAge(){
        System.out.println(getAge());
    }
}
