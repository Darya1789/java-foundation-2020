package ru.itsjava.homework.oop2.figure;

public class Circle extends Figure {
    private int sideR;

    public Circle(int sideR) {
        this.sideR = sideR;
    }

    @Override
    public double getArea() {
        return PI * (sideR * sideR);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * sideR;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "sideR=" + sideR +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;
        if (this.getArea() == circle.getArea()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
