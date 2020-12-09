package ru.itsjava.classwork.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.print(season + " ");
        }

        System.out.println();
        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        System.out.println(WinterMonth.DECEMBER);
    }
}
