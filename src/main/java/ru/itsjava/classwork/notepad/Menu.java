package ru.itsjava.classwork.notepad;

import java.util.Scanner;

public class Menu {
    Scanner console = new Scanner(System.in);
    Entry message1 = new Entry("Сообщение 1");
    Entry message2 = new Entry("Сообщение 2");
    Entry message3 = new Entry("Сообщение 3");
    Entry[] entries = new Entry[]{message1, message2, message3};
    Notepad notepad = new Notepad(entries, console);

    public void start() {
        printMenu();
        while (true) {
            System.out.println("\nВведите номер меню.");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printMenu();
            } else if (menuNum == 2) {
                notepad.printNotepad();
            } else if (menuNum == 3) {
                notepad.addEntry();
            } else if (menuNum == 4) {
                notepad.delEntry();
            } else if (menuNum == 5) {
                notepad.editEntry();
            }
            else if (menuNum == 0) {
                System.exit(1);
            }
        }

    }

    private void printMenu() {
        System.out.println("\n1. Показать меню; " +
                "\n2. Показать блокнот; " +
                "\n3. Добавить запись; " +
                "\n4. Удалить запись;" +
                "\n5. Редатировать запись;" +
                "\n6. Выход.");
    }
}
