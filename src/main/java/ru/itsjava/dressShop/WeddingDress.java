package ru.itsjava.dressShop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeddingDress extends ShopItems {


    public WeddingDress(double price, String length) {
        super("Свадебное", "белое", price, length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
