package ru.itsjava.oop;

public class Meerkat {
    private String name;
    private boolean gender;
    private boolean isMale;

    public Meerkat() {
        System.out.println("Новый сурикат");
    }

    public Meerkat(String name) {
        this.name = name;
        System.out.println("Новый сурикат по имени " + name);
    }

    public Meerkat(String name, String gender) {
        this.name = name;
        if (gender.equalsIgnoreCase("женский")) {
            this.isMale = false;
        } else if (gender.equalsIgnoreCase("мужской")) {
            this.isMale = true;
        }
        System.out.println("Сурикат по имени " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenderByString(String gender) {
        if (gender.equalsIgnoreCase("женский")) {
            this.gender = false;
        } else if (gender.equalsIgnoreCase("мужской")) {
            this.gender = true;
        }
    }

    public String getName() {
        return name;
    }

    public String getStringGender() {
        if (isMale) {
            return "мужской";
        } else {
            return "женский";
        }
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
