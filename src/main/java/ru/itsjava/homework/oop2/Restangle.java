package ru.itsjava.homework.oop2;

public class Restangle extends Figure {
    private int sideA;
    private int sideB;

    public Restangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double square() {
        return sideA * sideB;
    }
}
