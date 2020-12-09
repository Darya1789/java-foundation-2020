package ru.itsjava.classwork.proxy;

import ru.itsjava.classwork.exceptions.IncorrectUsernameException;

public class UserProxy extends User{

    public UserProxy(String name) {
        super(name);
    }

    public void setName(String name) {
        try {
            super.setName(name);
        } catch (IncorrectUsernameException incorrectUsernameException) {
            incorrectUsernameException.printStackTrace();
        }
    }
}
