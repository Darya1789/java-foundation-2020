package ru.itsjava.homework.iostrams;

import java.io.*;

public class IOStreamsHW {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Сериализация обекта User
        User user1 = new User("admin", "qwerty");
        System.out.println("Before serialization: " + user1);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/user.out"));
        objectOutputStream.writeObject(user1);

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"));
        Object user1AfterSerialization = objectInputStream.readObject();
        System.out.println("After serialization: " + user1AfterSerialization);


        // Поменять значения 2х файлов местами

        File file1 = new File("src/main/resources/file1");
        File file2 = new File("src/main/resources/file2");
        File fileTemp = new File("src/main/resources/fileTemp");

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = fileReader.readLine()) != null) {
                try (PrintWriter fileWriter = new PrintWriter(fileTemp)) {
                    fileWriter.println(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader fileReader = new BufferedReader(new FileReader(file2))) {
            String input;
            while ((input = fileReader.readLine()) != null) {
                try (PrintWriter fileWriter = new PrintWriter(file1)) {
                    fileWriter.println(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileTemp))) {
            String input;
            while ((input = fileReader.readLine()) != null) {
                try (PrintWriter fileWriter = new PrintWriter(file2)) {
                    fileWriter.println(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        // ввод 10 предложений в файл
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("File name: ");
        String fileName = reader.readLine();
        System.out.println("File path: ");
        String filePath = reader.readLine();
        String file = filePath + fileName;

        try (PrintWriter fileWriter = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                fileWriter.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
