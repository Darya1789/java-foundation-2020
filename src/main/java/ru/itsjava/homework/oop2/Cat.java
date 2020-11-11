package ru.itsjava.homework.oop2;

import lombok.Setter;

@Setter
public class Cat {
    private String name;

    public Cat() {
        System.out.println("Кошка - родитель");
    }

    public void sayMeow() {
        System.out.println("Meow Mrrr Meow");
    }


}
