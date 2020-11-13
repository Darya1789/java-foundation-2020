package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor

public class Telephone {
    private final String brend;
    private final String model;

    private String color;

//    public Telephone(String brend) {
//        this.brend = brend;
//    }


    @Override
    public String toString() {
        return "Телефон {" +
                "марка ='" + brend + '\'' +
                ", модель ='" + model + '\'' +
                '}';
    }
}
