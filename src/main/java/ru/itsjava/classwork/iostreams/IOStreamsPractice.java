package ru.itsjava.classwork.iostreams;

import java.io.*;

public class IOStreamsPractice {
    public static void main(String[] args) {
        System.out.println();
//        File file = new File("my-file.txt");
//        File file = new File("C:\\Users\\dmost\\IdeaProjects\\java-foundation-2020\\src\\main\\resources\\my-file.txt");

        // Относительный путь
        File file = new File("src\\main\\resources\\my-file.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Privet");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        try {
//            BufferedReader fileReader = new BufferedReader(new FileReader(file));
//            System.out.println(fileReader.readLine());
//            fileReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }


        // try with resources (AutoClosable)
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file));) {
            System.out.println(fileReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}