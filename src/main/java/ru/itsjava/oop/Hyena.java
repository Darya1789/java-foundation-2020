package ru.itsjava.oop;

public class Hyena {
    private String name;
    private String color;
    private int pawsCount;

    public Hyena(){
        pawsCount = 4;
        System.out.println("Новая гиена");
    }
    public Hyena(String name) {
        this.name = name;
        System.out.println("Новая гиена по имени " + name);
    }

    public Hyena(String name, String color) {
        pawsCount = 4;
        this.name = name;
        this.color = color;
        System.out.println("Гиена по имени " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
    public int getPawsCount() {
        return pawsCount;
    }


    public void printName() {
        System.out.println(name);
    }

    public void sayHahaha() {
        System.out.println("Гиена " + name + " смеется");
    }

}
