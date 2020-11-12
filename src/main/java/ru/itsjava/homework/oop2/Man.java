package ru.itsjava.homework.oop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Man extends Person {


    public Man() {
        isMale = true;
        System.out.println("Мужчина");
    }
}
