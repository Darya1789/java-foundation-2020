package ru.itsjava.homework.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 110) throw new IncorrectAge();
            this.age = age;
    }
}
