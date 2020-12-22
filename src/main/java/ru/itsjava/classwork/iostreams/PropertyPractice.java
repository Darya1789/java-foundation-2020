package ru.itsjava.classwork.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyPractice {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("src/main/resources/application.properties"));
//        System.out.println("properties.getProperty(\"db.url\") = " + properties.getProperty("db.url"));
//        System.out.println("properties.getProperty(\"db.url1\") = "
//                + properties.getProperty("db.url1", "NO Value"));

        InputStream inputStream = PropertyPractice.class.getClassLoader().
                getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        properties.load(new FileInputStream("src/main/resources/application.properties"));
        System.out.println("properties.getProperty(\"db.url\") = "
                + properties.getProperty("db.url1", "NO Value"));


    }
}
