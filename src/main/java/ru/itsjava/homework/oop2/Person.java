package ru.itsjava.homework.oop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Person {
    private boolean isMale;
    private String name;
    private int age;

    public Person() {
        System.out.println("Человек");
    }

    public void printAge(){
        System.out.println(getAge());
    }
}
