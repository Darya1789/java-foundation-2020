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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dress)) return false;

        Dress dress = (Dress) o;

        if (Double.compare(dress.price, price) != 0) return false;
        if (!type.equalsIgnoreCase(dress.type)) return false;
        return length.equalsIgnoreCase(dress.length);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}

