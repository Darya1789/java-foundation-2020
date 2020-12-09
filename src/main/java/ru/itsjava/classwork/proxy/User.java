package ru.itsjava.classwork.proxy;


import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import ru.itsjava.classwork.exceptions.IncorrectUsernameException;

@AllArgsConstructor
public class User {
    private String name;

    @SneakyThrows
    public void setName(String name) throws IncorrectUsernameException {
        if (name.trim().equals(""))  {
            throw new IncorrectUsernameException("Пустое имя");
        }
        this.name = name;
    }
}
