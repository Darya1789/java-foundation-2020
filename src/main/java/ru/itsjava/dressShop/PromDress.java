package ru.itsjava.dressShop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromDress extends ShopItems {


    public PromDress(String color, double price, String length) {
        super("Выпукное", color, price, length);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
