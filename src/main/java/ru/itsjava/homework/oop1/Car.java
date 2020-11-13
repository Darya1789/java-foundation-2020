package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {
    private final String brend;
    private final String model;
    private String color;
    private int doorCount;


    @Override
    public String toString() {
        return "Машина {" +
                "марка ='" + brend + '\'' +
                ", модель ='" + model + '\'' +
                '}';
    }
}
