package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cup {
    private String color;
    private String type;
    private String materialType;

    public Cup(String type) {
        this.type = type;
    }

}
