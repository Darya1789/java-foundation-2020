package ru.itsjava.inheritance;

public class Bmv extends Car implements Movable, Controllable{
    @Override
    public String getCarMake() {
        return "Bmv";
    }

    @Override
    public void move() {
        System.out.println(getCarMake() + " move!");
    }
}
