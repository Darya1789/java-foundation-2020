package ru.itsjava.homework.iostrams;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class User implements Serializable {
    private final String login;
    private transient String password;
}
