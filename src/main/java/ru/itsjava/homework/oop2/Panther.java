package ru.itsjava.homework.oop2;


public class Panther extends Cat{
    private String name;

    public Panther() {
        System.out.println("Пантера - доча родителя кошки");
    }

    @Override
    public void sayMeow() {
        System.out.println("Panther say RRRRRRR");
    }
}
