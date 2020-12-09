package ru.itsjava.classwork.exceptions;


import lombok.SneakyThrows;

public class User {
    private String name;

    public User(String name) {
       // if (name.trim().equals("")) throw new IncorrectUsernameException();
        this.name = name;
    }

//    public void setName(String name) throws IncorrectUsernameException{
//        if (name.trim().equals("")) throw new IncorrectUsernameException("Пустое имя");
//        this.name = name;
//    }

    @SneakyThrows
    public void setName(String name) {
        if (name.trim().equals("")) throw new IncorrectUsernameException("Пустое имя");
        this.name = name;
    }
}
