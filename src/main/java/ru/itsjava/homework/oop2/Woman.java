package ru.itsjava.homework.oop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Woman extends Person{


    public Woman() {
        isMale =false;
        System.out.println("Женщина");
    }

    @Override
    public void printAge() {
        System.out.println("Всегда 18");
    }
}
