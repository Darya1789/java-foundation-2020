package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Man {
    public String name;
    public boolean isMale;
    public int footCount;
    public int handCount;
    public String race;

    public Man(String name, boolean isMale) {
        footCount = 2;
        handCount = 2;
        this.name = name;
        this.isMale = isMale;
        System.out.println("Человек по имени " + name);
    }
}
