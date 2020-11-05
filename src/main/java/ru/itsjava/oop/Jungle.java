package ru.itsjava.oop;

public class Jungle {
    public static void main(String[] args) {
        Lion lion = new Lion("Scar");
        lion.printLion();

        lion.setName("Король Шрам");
        lion.printLion();

        System.out.println("В наших джунглях есть: " + lion.getName());

        lion.setPawsCount(3);
        System.out.println("Лев с " + lion.getPawsCount() + " лапами");
    }
}
