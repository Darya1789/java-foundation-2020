package ru.itsjava.homework.oop1;

public class StartClass {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setName("Машка");
        cow.setBreed("Серая");
        System.out.println("Корова по имени " + cow.getName() + ". Порода: " + cow.getBreed());

        Man man = new Man("Миша", true);
        man.setRace("Монголоидная");
        System.out.println("man.getRace() = " + man.getRace());

        Shop shop = new Shop("Великолукский");
        shop.setShopType("Мясной");
        System.out.println("shop.getShopType() = " + shop.getShopType());

        House home = new House("Кирпичный", "улю Ленина, 22");
        home.setFloorCount(3);
        System.out.println("home.getFloorCount() = " + home.getFloorCount());

        Mountain ural = new Mountain("Уральские");
        ural.setHeigth(1900);
        System.out.println("ural.getHeigth() = " + ural.getHeigth());



    }
}
