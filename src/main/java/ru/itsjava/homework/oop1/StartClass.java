package ru.itsjava.homework.oop1;

public class StartClass {
    public static void main(String[] args) {
        Cow cow = new Cow("Машка", "серая");
        System.out.println("Корова по имени " + cow.getName() + ". Порода: " + cow.getBreed());

        Man man = new Man("Миша", "монголодная");
        System.out.println("man.getRace() = " + man.getRace());

        Shop shop = new Shop("Великолукский", "Мясной", 25);
        System.out.println("shop.getShopType() = " + shop.getShopType());

        House home = new House("Кирпичный", "ул Ленина, 22");
        home.setFloorCount(3);
        System.out.println("home.getFloorCount() = " + home.getFloorCount());

        Mountain ural = new Mountain("Уральские");
        ural.setHeigth(1900);
        System.out.println("ural.getHeigth() = " + ural.getHeigth());




        // Новое задание по toString
        System.out.println("\nНовое задание по toString");

        Car bmv = new Car("BMV", "X5");
        System.out.println(bmv.toString());

        System.out.println(cow.toString());

        Cup chashka = new Cup("Граненный стакан", "стекло");
        System.out.println(chashka.toString());

        System.out.println(home.toString());

        System.out.println(man.toString());

        System.out.println(ural.toString());

        Notebook msi = new Notebook("msi", "x56i");
        System.out.println(msi.toString());

        System.out.println(shop.toString());

        Telephone phone = new Telephone("Xiaomi", "8 pro");
        System.out.println(phone.toString());


        // Задание про контакт из волк с Уолл Стрит
        System.out.println("Задание про контакт из волк с Уолл Стрит");
        Contact dasha = new Contact("Даша", "89818571789");
        Contact ilya = new Contact("Илья", "89881416838");
        Contact dasha2 = new Contact("Даша", "89818571789", 18, "Рстовская 22");
        Contact ilya2 = new Contact("Илья", "89881416838");


        System.out.println("Проверка равенства контактов \'" + dasha.toString() + "\' и \'" + dasha2.toString() + "\' "+ dasha.equals(dasha2));
        System.out.println("Проверка равенства контактов \'" + dasha.toString() + "\' и \'" + ilya.toString() + "\' " + dasha.equals(ilya));
        System.out.println("Проверка равенства контактов \'" + dasha2.toString() + "\' и \'" + ilya.toString() + "\' " + dasha2.equals(ilya));
        System.out.println("Проверка равенства контактов \'" + ilya2.toString() + "\' и \'" + ilya2.toString() + "\' " + ilya2.equals(ilya));


    }
}
