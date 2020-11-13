package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor

public class Cow {
    private String color;
    private final String name;
    private final String breed;

    private String pawsCount;

//    public Cow() {
//        System.out.println("Просто корова");
//    }


    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Корова {" + "имя = \'" + name + "\', порода = \'" + breed + "\'}";
    }



}
