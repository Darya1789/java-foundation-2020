package ru.itsjava.oop;

public class Meerkat {
    private String name;
    private String gender;

    public Meerkat() {
        System.out.println("Новый сурикат");
    }

    public Meerkat(String name) {
        this.name = name;
        System.out.println("Новый сурикат по имени " + name);
    }

    public Meerkat(String name, String gender) {
        this.name = name;
        this.gender = gender;
        System.out.println("Сурикат по имени " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printGender() {
        System.out.println(gender);
    }

    public void searchEat() {
        System.out.println("Сурикат " + name + " в поисках еды");
    }

}
