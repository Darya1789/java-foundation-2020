package ru.itsjava.oop;

public class WildBoar {
    private String name;
    private int age;
    private double height;

    public WildBoar() {
        System.out.println("Новый дикий кабан");
    }

    public WildBoar(String name) {
        this.name = name;
        System.out.println("Новый дикий кабан по имени " + name);
    }

    public WildBoar(String name, double height) {
        this.name = name;
        this.height = height;
        System.out.println("Дикий кабан по имени " + name + ". Вес " + height);
    }

    public WildBoar(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
        System.out.println("Новый дикий кабан по имени " + name + ". Вес " + height + ", возраст " + age);
    }

    public double eat(double food) {
        height = height + food;
        System.out.println(name + " поел, теперь: " + height);
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void sayHru() {
        System.out.println("Кабан " + name + " сказал Хрю");
    }

    public void printName() {
        System.out.println(name);
    }

    public double toilet() {
        height = height - 2;
        System.out.println("С облегчением Пумба");
        return height;
    }
}
