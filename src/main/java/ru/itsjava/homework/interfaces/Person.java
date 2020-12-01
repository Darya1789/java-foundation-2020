package ru.itsjava.homework.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable{
    private String name;
    private String surname;
    private double age;

    @Override
    public int compareTo(Person o) {
        int compareName = name.compareTo(o.name);
        int compareSurname = surname.compareTo(o.surname);
        if (compareName == 0) {
            if (compareSurname == 0) {
                return Double.compare(age, o.age);
            }
        } else return compareName;
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
