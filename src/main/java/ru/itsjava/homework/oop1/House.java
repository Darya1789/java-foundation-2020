package ru.itsjava.homework.oop1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class House {
    private int floorCount;
    private String type;
    private String address;

    public House(String type, String address) {
        this.type = type;
        this.address = address;
    }
}
