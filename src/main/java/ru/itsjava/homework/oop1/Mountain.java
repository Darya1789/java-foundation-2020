package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor

public class Mountain {
    private final String name;
    private int heigth;
    private int length;

//    public Mountain(String name) {
//        this.name = name;
//    }


    @Override
    public String toString() {
        return "Горы {" +
                "название ='" + name + '\'' +
                '}';
    }
}
