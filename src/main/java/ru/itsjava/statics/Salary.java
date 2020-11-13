package ru.itsjava.statics;

public class Salary {
    private int baseSalary;
    public static double increaseCoefficient = 1.0;

    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getFullSalary() {
        return baseSalary * increaseCoefficient;
    }
}
