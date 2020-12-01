package ru.itsjava.homework.oop2.figure;


public class Restangle extends Figure {
    private int sideA;
    private int sideB;

    public Restangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Restangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restangle)) return false;

        Restangle restangle = (Restangle) o;

        if (this.getPerimeter() == restangle.getPerimeter()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
