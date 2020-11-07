package ru.itsjava.homework.oop1;

public class StartClass {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setName("Машка");
        cow.setBreed("Серая");
        System.out.println("Корова по имени " + cow.getName() + ". Порода: " + cow.getBreed());

    }
}
