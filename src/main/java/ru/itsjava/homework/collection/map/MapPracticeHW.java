package ru.itsjava.homework.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapPracticeHW {
    public static void main(String[] args) {
        Map<String, Fruit> map = new HashMap<>();
        Fruit apple = new Fruit("apple", 20);
        Fruit pear = new Fruit("pear", 25);
        Fruit cherry = new Fruit("cherry", 5);
        Fruit apricot = new Fruit("apricot", 10);
        Fruit peach = new Fruit("peach", 21);
        Fruit melon = new Fruit("melon", 500);
        Fruit watermelon = new Fruit("watermelon", 1500);

        map.put("Иванов", apple);


        // Задание 1. Получение элемента по ключу
        System.out.println("Результат получения элемента по ключу \"Иванов\" = " + map.get("Иванов"));

        // Задание 2. Добавить 5 фруктов. В новый HashMap добавить старый map

        map.put("Смирнов", pear);
        map.put("Сидоров", cherry);
        map.put("Петров", apricot);
        map.put("Козлов", peach);
        map.put("Иванова", apple);

        Map<String, Fruit> newMap = new HashMap<>();
        newMap.putAll(map);

        // Задание 3. Удалить любой фрукт
        System.out.println("Результат удаления груши = " + map.remove("Смирнов"));
        System.out.println("Результат удаления груши = " + map.remove("Смирнов"));

        // Задание 4. Проверка на наличие ключ и значение
        System.out.println("Результат проверки наличия по ключу \"Смирнов\" = " + map.containsKey("Смирнов"));
        System.out.println("Результат проверки наличия по ключу \"Иванов\" = " + map.containsKey("Иванов"));
        System.out.println("Результат проверки наличия по знаечнию \"apple\" = " + map.containsValue(apple));
        System.out.println("Результат проверки наличия по знаечнию \"melon\" = " + map.containsValue(melon));

        // Задание 5. Вывести на экран все ключи, все значения, все ключи и значения
        for (String person : map.keySet()) {
            System.out.print(person + " ");
        }
        System.out.println("\n");

        for (String person : map.keySet()) {
            System.out.print(map.get(person) + " ");
        }
        System.out.println("\n");

        for (Map.Entry<String, Fruit> pair : map.entrySet()) {
            System.out.print(pair.getKey() + ": {" + pair.getValue() + "}; ");
        }
        System.out.println("\n");

        // Задание 6а. Вернуть количество ключей, длина которых больше 5
        int countPerson = 0;
        for (String person : map.keySet()) {
            if (person.length() > 5) {
                countPerson++;
            }
        }
        System.out.println("Количество покупателей, чье имя больше 5: " + countPerson);

        //Задание 6б. Вернуть количество элементов равны дыне
        int countMelon = 0;
        for (String person : map.keySet()) {
            if (map.get(person).equals(melon)) {
                countMelon++;
            }
        }
        System.out.println("Количество дынь: " + countMelon);

        int countApple = 0;
        for (String person : map.keySet()) {
            if (map.get(person).equals(apple)) {
                countApple++;
            }
        }
        System.out.println("Количество яблок: " + countApple);

        // Задание 7а. Пропустить 2 элемента, значения которых яблоко, все остальные вывести
        System.out.println("\nПропустить 2 элемента, значения которых яблоко, все остальные вывести");
        map.put("Павлов", apple);

        int countAppleAgain = 0;
        for (String person : map.keySet()) {
            if (map.get(person).equals(apple) && countAppleAgain < 2) {
                countAppleAgain++;
                continue;
            }
            System.out.print(person + ": {" + map.get(person) + "};");
        }
        System.out.println("\n");

        // Задание 7б. Вывести все элементы кроме 2, ключи которых начинаются на "С"
        System.out.println("\nВывести все элементы кроме 2, ключи которых начинаются на \"С\"");
        map.put("Сорокин", watermelon);
        map.put("Смирнов", pear);
        int countLetterC = 0;
        for (String person : map.keySet()) {
            if (person.charAt(0) == 'С' && countLetterC < 2) {
                countLetterC++;
                continue;
            }
            System.out.print(person + ": {" + map.get(person) + "};");
        }
        System.out.println("\n");

        // Задание 8. Вернуть первый элемент, значение котрого Apple, aPPle или apple
        System.out.println("\nВернуть первый элемент, значение котрого Apple, aPPle или apple");
        for (String person : map.keySet()) {
            if (map.get(person).getName().equalsIgnoreCase("apple")) {
                System.out.println(person + ": {" + map.get(person) + "}");
                break;
            }
        }

        //Задание 10. Найти средний вес всех фруктов
        System.out.println("\nНайти средний вес всех фруктов");
        double averageHeight = 0;
        for (String person : map.keySet()) {
            averageHeight += map.get(person).getHeigth();
        }
        System.out.println("Cредний вес всех фруктов: " + averageHeight / map.size());


    }
}

