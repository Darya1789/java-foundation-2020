package ru.itsjava.classwork.notepad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;


@AllArgsConstructor
@Setter
@Getter
public class Notepad {
    private Entry[] entries;
    private final Scanner console;

    public void printNotepad() {
        for (int i = 0; i < entries.length; i++) {
            System.out.println((i + 1) + ". " + entries[i]);
        }
    }

    public void addEntry() {
        Entry[] newEntries = new Entry[entries.length + 1];
        for (int i = 0; i < entries.length; i++) {
            newEntries[i] = entries[i];
        }
        System.out.println("Введите новую запись: ");
        String newMessage = console.next();
        newEntries[newEntries.length - 1] = new Entry(newMessage);
        entries = newEntries;


    }

    public void delEntry() {
        Entry[] newEntries = new Entry[entries.length - 1];
        if (newEntries.length > 0) {
            printNotepad();
            System.out.println("Какую запись удалить?");
            int entryNum = console.nextInt() - 1;
            for (int i = 0; i < newEntries.length; i++) {
                newEntries[i] = entries[i];
            }
            for (int i = entryNum; i < newEntries.length; i++) {
                newEntries[i] = entries[i + 1];
            }
        }
        entries = newEntries;

    }

    public void editEntry() {
        printNotepad();
        System.out.println("Какую запись отредктировать?");
        int numEntry = console.nextInt() - 1;
        System.out.println("Напишите исправленную запись: ");
        String newEntry = console.next();
        entries[numEntry].setMessage(newEntry);
    }
}
