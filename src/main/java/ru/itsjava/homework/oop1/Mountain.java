package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Mountain {
    private String name;
    private int heigth;
    private int length;

    public Mountain(String name) {
        this.name = name;
    }
}
