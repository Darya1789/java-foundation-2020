package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor

public class Notebook {
    private final String brend;
    private final String model;
    private String processor;

//    public Notebook(String brend) {
//        this.brend = brend;
//    }


    @Override
    public String toString() {
        return "Ноутбук {" +
                "марка ='" + brend + '\'' +
                ", модель ='" + model + '\'' +
                '}';
    }
}
