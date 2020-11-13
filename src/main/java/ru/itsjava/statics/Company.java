package ru.itsjava.statics;

public class Company {

    public static void main(String[] args) {
        Salary cleanWasherSalary = new Salary(10000);
        Salary ceoSalary = new Salary(100000);

        Salary.increaseCoefficient = 5;
        System.out.println("cleanWasherSalary.getFullSalary() = " + cleanWasherSalary.getFullSalary());
        System.out.println("ceoSalary.getFullSalary() = " + ceoSalary.getFullSalary());

        Salary.increaseCoefficient = 5;
    }
}
