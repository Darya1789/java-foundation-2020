package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Car {
    private String brend;
    private String model;
    private String color;
    private int doorCount;

    public Car(String brend) {
        this.brend = brend;
    }
}
