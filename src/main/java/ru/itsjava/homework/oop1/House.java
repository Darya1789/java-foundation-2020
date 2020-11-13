package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor

public class House {
    private int floorCount;
    private final String type;
    private final String address;

//    public House(String type, String address) {
//        this.type = type;
//        this.address = address;
//}

    @Override
    public String toString() {
        return "Дом {" +
                "тип дома ='" + type + '\'' +
                ", адрес ='" + address + '\'' +
                '}';
    }
}
