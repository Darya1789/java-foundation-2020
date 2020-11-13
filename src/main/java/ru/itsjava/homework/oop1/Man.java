package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor

public class Man {
    public final String name;
    public boolean isMale;
    public int footCount;
    public int handCount;
    public final String race;

//    public Man(String name, boolean isMale) {
//        footCount = 2;
//        handCount = 2;
//        this.name = name;
//        this.isMale = isMale;
//        System.out.println("Человек по имени " + name);
//    }


    @Override
    public String toString() {
        return "Мужчина {" +
                "имя ='" + name + '\'' +
                ", раса ='" + race + '\'' +
                '}';
    }
}
