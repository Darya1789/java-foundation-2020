package ru.itsjava.homework.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHW {
    public static void main(String[] args) {
        //Задание 0. Список пустой, список размер 20
        System.out.println("\nЗадание 0а. Список пустой");
        List<String> arrayNull = new ArrayList<>();
        System.out.println("Пустой списко: " + arrayNull);
        System.out.println("\nЗадание 0б. Список размер 20");
        List<String> array = new ArrayList<>(20);
        System.out.println("Список размером 20: " + array);

        //Задание 2а.Добавить подряд 5 элементов
        System.out.println("\nЗадание 2а.Добавить подряд 5 элементов");
        System.out.println("Наш список: " + array);
        array.add("первый");
        array.add("второй");
        array.add("третий");
        array.add("четвертый");
        array.add("пятый");
        System.out.println("Список после добавления 5 элементов: " + array);

        //Задание 2б. Добавить 6 элемент в 3 позицию, добавить 7 элемент в 1 позицию
        System.out.println("\nЗадание 2б. Добавить 6 элемент в 3 позицию, добавить 7 элемент в 1 позицию");
        array.add("шестой");
        array.add("седьмой");
        array.add("восьмой");
        System.out.println("array.get(1) = " + array.get(1));
        System.out.println("array.get(3) = " + array.get(3));
        array.set(3, array.get(6));
        array.set(1, array.get(7));
        System.out.println("После замены: array.get(1) = " + array.get(1));
        System.out.println("После замены: array.get(3) = " + array.get(3));
        //вернем обратно
        array.set(1, "второй");
        array.set(3, "четвертый");


        //Задание 2в. Записать в новый список все элементы предыдушего списка
        System.out.println("\nЗадание 2в. Записать в новый список все элементы предыдушего списка");
        List<String> newArray = new ArrayList<>();
        newArray.addAll(array);
        System.out.println("Наш список: " + array);
        System.out.println("Новый список:" + newArray);

        //Задание 1. Получить первый и последний элементы
        System.out.println("\nЗадание 1. Получить первый и последний элементы");
        System.out.println("Первый элемент: " + array.get(0));
        System.out.println("Последний элемент: " + array.get(array.size() - 1));

        //Задание 3, 4. Удалить элемент по значению и по индексу, проверить наличие элемента
        System.out.println("\nЗадание 3, 4. Удалить элемент по значению и по индексу, проверить наличие элемента");
        System.out.println("Наш список: " + array);
        array.remove(1);
        System.out.println("Список после удаления элемента с индексом 1: " + array);
        array.remove("первый");
        System.out.println("Список после удаления элемента со значением \"второй\": " + array);
        System.out.println("array.contains(\"второй\") = " + array.contains("второй"));
        System.out.println("array.contains(\"третий\") = " + array.contains("третий"));
        //вернем список обратно
        array = newArray;

        //Задание 5. Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println("\nЗадание 5. Вывести список на экран в формате: List: {\"First\";\"Second\";\"Third\"}");
        System.out.print("List: {\"");
        for (int i = 0; i < array.size() - 1; i++) {
            System.out.print(array.get(i) + "\";\"");
        }
        System.out.println(array.get(array.size() - 1) + "\"}");

        //Задание 6. Вернуть записи: если индекс делится на 3; количество элементов равных ***
        System.out.println("\nЗадание 6. Вернуть записи: если индекс делится на 3; количество элементов равных ***");
        System.out.print("Елементы списка, индексы которых делятся на три: ");
        for (int i = 1; i < array.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(array.get(i) + " ");
            }
        }
        array.add("седьмой");
        array.add("седьмой");
        int count = 0;
        for (String elem : array) {
            if (elem.equals("седьмой")) {
                count++;
            }
        }
        System.out.println("\nКоличество элементов со значением \"седьмой\": " + count);

        //Задание 7. Пропустить несколько первых элементов
        System.out.println("\nЗадание 7. Пропустить несколько первых элементов");
        System.out.print("Список без первых 2 элементов: [");
        for (int i = 2; i < array.size() - 1; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.println(array.get(array.size() - 1) + "]");

        //Задание 7а. Пропустить первый два элемента, которые равны "седьмой"
        System.out.println("\nЗадание 7а. Пропустить первый два элемента, которые равны \"седьмой\"");
        System.out.println("Список: " + array);
        int countSeven = 0;
        for (String elem : array) {
            if (elem != "седьмой" && countSeven < 2) {
                System.out.print(elem + " ");
            } else {
                countSeven++;
                if (countSeven > 2) {
                    System.out.print(elem + " ");
                }
            }
        }
        System.out.println();

        // Задание 8, 9. Вернуть первый элемент делящися на 3. Все элементы делящиеся на 3
        System.out.println("\nЗадание 8, 9. Вернуть первый элемент делящися на 3. Все элементы делящиеся на 3");
        System.out.print("Первый элемент, длина которого делится на 3: ");
        for (String elem : array) {
            if (elem.length() % 3 == 0) {
                System.out.print(elem);
                break;
            }
        }
        System.out.print("\nЭлементы, длины которых делятся на 3: ");
        for (String elem : array) {
            if (elem.length() % 3 == 0) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();

        //Задание 10. Вернуть всех военнообязанных мужчин, которым меньше 27 и больше 18, и имя которых начинается на "Н"
        System.out.println("\nЗадание 10. Вернуть всех военнообязанных мужчин, " +
                "которым меньше 27 и больше 18, и имя которых начинается на \"Н\"");
        Person vasya = new Person("Василий", true, 25);
        Person kolya = new Person("Николай", true, 23);
        Person kolya2 = new Person("Николай", true, 30);
        Person nadya = new Person("Надежда", false, 20);
        Person nikita = new Person("Никита", true, 19);
        Person nikita2 = new Person("Никита", true, 26);

        List<Person> men = new ArrayList<>();
        men.add(vasya);
        men.add(kolya);
        men.add(kolya2);
        men.add(nadya);
        men.add(nikita);
        men.add(nikita2);

        System.out.println("Список людей: " + men);
        String letter = "Н";
        for (Person person : men) {
            if (person.isMale() && (person.getAge() >= 18 && person.getAge() <= 27) &&
                    person.getName().charAt(0) == letter.charAt(0)) {
                System.out.println(person);
            }
        }

    }


}