package ru.itsjava.classwork.iostreams;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Person implements Serializable {
    private final String name;
    private int age;
//    private String hairColor;

}
