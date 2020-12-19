package ru.itsjava.homework.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPracticeHW {
    public static void main(String[] args) {


        Fruit apple = new Fruit("apple", 20);
        Fruit pear = new Fruit("pear", 25);
        Fruit cherry = new Fruit("cherry", 5);
        Fruit apricot = new Fruit("apricot", 10);
        Fruit peach = new Fruit("peach", 21);

        // Задание 1. Создать множество фруктов
        Set<Fruit> fruits = new HashSet<>();
        fruits.add(apple);
        fruits.add(pear);
        fruits.add(cherry);

        // Задание 2. Добавить фрукт, добавить его же
        System.out.println("Результат добавления абрикоса в множество = " + fruits.add(apricot));
        System.out.println("Результат добавления абрикоса в множество = " + fruits.add(apricot));

        // Задание 3. Удалить фрукт из множества
        System.out.println("Результат удаления вишни из множества = " + fruits.remove(cherry));
        System.out.println("Результат удаления вишни из множества = " + fruits.remove(cherry));

        // Задание 4. Проверить содержиться ли фрукт в множестве
        System.out.println("Содержится ли яблоко во множестве = " + fruits.contains(apple));
        System.out.println("Содержится ли персик во множестве = " + fruits.contains(peach));

        // Задание 5. Пробежаться с помощью итератора и вывести множество
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}
