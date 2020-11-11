package ru.itsjava.homework.oop2;

public class Square extends Figure{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double square() {
        return side * side;
    }

}
