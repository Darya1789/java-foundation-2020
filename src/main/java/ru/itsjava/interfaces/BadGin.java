package ru.itsjava.interfaces;

public class BadGin implements Creatable{
    @Override
    public void createWish() {
        System.out.println("Слушаюсб и повинуюсь! Но я тебя подставил.");
    }
}
