package ru.itsjava.homework.interfaces;

public class Vodka {
    private String name;
    private double volume;
    private String country;
    private String flavor;

    public Vodka(String name) {
        this.name = name;
    }

    public Vodka(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Vodka(String name, double volume, String country) {
        this.name = name;
        this.volume = volume;
        this.country = country;
    }

    public Vodka(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void drinkTooMuch(String name) {
        System.out.println("Перепил водку " + name);
    }

    public void drinkTooMuch(String name, double volume) {
        System.out.println("Перепил водку " + name + ". Выпил " + volume + " литров");
    }

    public void drinkTooMuch(String name, double volume, String country) {
        System.out.println("Перепил водку " + name + " из страны " + country + ". Выпил " + volume + " литров");
    }

    public void drinkTooMuch(String name, String flavor) {
        System.out.println("Перепил водку " + name + ". С нотками " + flavor);
    }


}
