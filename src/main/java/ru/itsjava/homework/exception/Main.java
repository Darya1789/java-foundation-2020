package ru.itsjava.homework.exception;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Darya");
        try {
            person.setAge(120);
        } catch (IncorrectAge incorrectAge) {
            System.err.println(incorrectAge);
        }

    }
}
