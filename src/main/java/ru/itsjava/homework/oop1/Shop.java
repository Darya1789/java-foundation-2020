package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor

public class Shop {
    private String name;
    private String shopType;
    private int itemsCount;

//    public Shop(String name){    }


    @Override
    public String toString() {
        return "Магазин {" +
                "название ='" + name + '\'' +
                ", типа магазина ='" + shopType + '\'' +
                '}';
    }
}
