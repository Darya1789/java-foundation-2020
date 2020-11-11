package ru.itsjava.homework.oop2;

public class StartClass {
    public static void main(String[] args) {

        // Задание про котов
        System.out.println("Задание про котов");
        Cat cat = new Cat();
        Panther panther = new Panther();
        cat.sayMeow();
        panther.sayMeow();



        // Задание про людей
        System.out.println("\nЗадание про людей");
        Man ivan = new Man();
        Man pasha = new Man();
        Woman masha = new Woman();
        Woman sveta = new Woman();

        ivan.setName("Ivan");
        ivan.setAge(27);
        pasha.setName("Pasha");
        pasha.setAge(56);
        masha.setName("Masha");
        masha.setAge(35);
        sveta.setName("Sveta");
        sveta.setAge(48);

        Person[] arrayPerson = new Person[]{ivan, pasha, masha, sveta};
        for (Person person: arrayPerson) {
            System.out.print(person.getName() + " : " );
            person.printAge();
        }


        // Задание про фигуры
        System.out.println("\nЗадание про фигуры");

        Figure kvadrat = new Square(5);
        Figure treygolnik = new Triangle(3,4,5);
        Figure pryamoygolnik = new Restangle(5, 8);

        System.out.println("kvadrat.perimeter() = " + kvadrat.perimeter());
        System.out.println("kvadrat.square() = " + kvadrat.square());

        System.out.println("treygolnik.perimeter() = " + treygolnik.perimeter());
        System.out.println("treygolnik.square() = " + treygolnik.square());

        System.out.println("pryamoygolnik.perimeter() = " + pryamoygolnik.perimeter());
        System.out.println("pryamoygolnik.square() = " + pryamoygolnik.square());


    }
}
