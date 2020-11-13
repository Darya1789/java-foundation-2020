package ru.itsjava.homework.oop1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter

public class Contact {
    public final String name;
    public final String phone;
    public int age;
    public String address;

    @Override
    public String toString() {
        return "Контакт {" +
                "имя ='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { // метод equals, параметром передается некоторый объект о
        if (this == o) return true;  // проверка на равенство ссылок текущего контакта с входящим объектом.
                                            // Если равны - True. Сравнение закончено
        if (!(o instanceof Contact)) return false; // проверка  явлется ли входящий объект наследником класса Contact.
                                                        // Если нет - Faslse. Сравнение окончено.

        Contact contact = (Contact) o;  // приводим тип входящего объекта к классу Contact

        if (age != contact.age) return false;  // есди поля age не равны, то false
        if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
                                                                    // если имя текущего объекта не пусто
                                                                    // сравниваем поля name текущего и входящего об.
                                                                    // иначе сравниваем name входящего об. с null
                                                                // возвращаем false, если ничто не равно, а name null

        if (!phone.equals(contact.phone)) return false;
                                                // проверка на равенство телефонов, если нет, то false
        return address != null ? address.equals(contact.address) : contact.address == null;
                                // возвращаем рузультат проверки:
                                // адрес текущего объекта не null, поля адрес равны у текущего и входящего об-в
                                // адрес входящего объекта не null
                                // тогда True, иначе False
    }

    @Override
    public int hashCode() {
        return phone.hashCode();
    }
}
