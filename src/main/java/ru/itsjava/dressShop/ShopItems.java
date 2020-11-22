package ru.itsjava.dressShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class ShopItems {
    private final String type;
    private final String color;
    private double price;
    private final String length;


    @Override
    public String toString() {
        return "Платье {" +
                "тип'" + type + '\'' +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                ", длина='" + length + '\'' +
                '}';
    }
}

