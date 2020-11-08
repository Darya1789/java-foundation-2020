package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Notebook {
    private String brend;
    private String model;
    private String processor;

    public Notebook(String brend) {
        this.brend = brend;
    }
}
