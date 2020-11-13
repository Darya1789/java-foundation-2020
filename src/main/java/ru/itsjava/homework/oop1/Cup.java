package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter

@AllArgsConstructor
@RequiredArgsConstructor

public class Cup {
    private final String type;
    private final String materialType;
    private String color;



//    public Cup(String type) {
//        this.type = type;
//    }


    @Override
    public String toString() {
        return "Чашка {" +
                "тип ='" + type + '\'' +
                ", материал ='" + materialType + '\'' +
                '}';
    }
}
