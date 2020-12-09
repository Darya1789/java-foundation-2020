package ru.itsjava.classwork.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Bmv();
        car.printEmotionals();

        Bmv bmv = new Bmv();
        bmv.move();
    }
}
