package tech.kisin.kimin.entity;

import tech.kisin.kimin.exception.ValidationException;

public class Username {
    private final String username;

    public Username(String username) {
        if (username == null) throw new ValidationException("Username cannot be null.");
        if (username.equals("")) throw new ValidationException("Username cannot be blank.");
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
