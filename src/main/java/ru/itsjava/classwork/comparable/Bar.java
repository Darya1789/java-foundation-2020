package ru.itsjava.classwork.comparable;

import java.util.Arrays;

public class Bar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle water = new Bottle("glass", 0.5);
        Bottle cola = new Bottle("plastic", 1.5);
        Bottle whisky = new Bottle("glass", 0.7);


        System.out.println("water.compareTo(whisky) = " + water.compareTo(whisky));

        Bottle[] bottles = {water, cola, whisky};
        System.out.println("Before " + Arrays.toString(bottles));
        Arrays.sort(bottles);
        System.out.println("After" + Arrays.toString(bottles));
        System.out.println();

        System.out.println("water.clone() = " + water.clone());

    }
}
