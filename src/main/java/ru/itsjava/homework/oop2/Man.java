package ru.itsjava.homework.oop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Man extends Person {
    private boolean isMale;
    private String name;
    private int age;

    public Man() {
        isMale = true;
        System.out.println("Мужчина");
    }
}
