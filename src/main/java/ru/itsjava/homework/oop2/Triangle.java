package ru.itsjava.homework.oop2;

public class Triangle extends Figure{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p*(p - sideA) * (p - sideB) * (p - sideC));
    }
}
