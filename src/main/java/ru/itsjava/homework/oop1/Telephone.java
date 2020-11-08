package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Telephone {
    private String model;
    private String brend;
    private String color;

    public Telephone(String brend) {
        this.brend = brend;
    }
}
