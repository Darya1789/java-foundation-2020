package ru.itsjava.classwork.oop;

public class Jungle {
    public static void main(String[] args) {
        Lion lion = new Lion("Scar");
        lion.printLion();

        lion.setName("Король Шрам");
        lion.printLion();

        System.out.println("В наших джунглях есть: " + lion.getName());

        lion.setPawsCount(3);
        System.out.println("Лев с " + lion.getPawsCount() + " лапами");

        Hyena shenzi = new Hyena("Шензи");
        System.out.println("shenzi.getName() = " + shenzi.getName());

        WildBoar pumpa = new WildBoar("Пумба", 35);
        System.out.println("pumpa.getHeight() = " + pumpa.getHeight());

        Meerkat timon = new Meerkat();
        timon.setName("Тимон");
        timon.setGenderByString("женский");
        System.out.println("timon.getGender() = " + timon.getStringGender());

        Cat mars = new BritishCat();
//        mars.sayMeow();
//        mars.sayMrrr();
        System.out.println("mars.getBreed() = " + mars.getBreed());
        mars.sayMeow();

    }
}
