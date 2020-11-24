package ru.itsjava.dressShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Dress {
    private final String type;
    private double price;
    private final String length;


    @Override
    public String toString() {
        return "Платье {" +
                "тип'" + type + '\'' +
                ", цена=" + price +
                ", длина='" + length + '\'' +
                '}';
    }
}

