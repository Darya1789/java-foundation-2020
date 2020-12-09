package ru.itsjava.classwork.string;

public class StringPractice {
    String str = "Я замечательная строка";

    String name = "Vitaliy";
    String nameCopy = "Vitaliy";
    String constName = new String("Vitaliy");
    String internName = constName.intern();

    long start = System.currentTimeMillis();

    long end = System.currentTimeMillis();


}

