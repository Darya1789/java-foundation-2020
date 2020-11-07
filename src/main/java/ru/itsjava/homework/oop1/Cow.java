package ru.itsjava.homework.oop1;

public class Cow {
    private String color;
    private String breed;
    private String name;
    private String pawsCount;

    public Cow() {
        System.out.println("Просто корова");
    }



    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
