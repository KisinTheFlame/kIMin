package tech.kisin.kimin.entity;

import tech.kisin.kimin.exception.ValidationException;

public class AccountNumber {
    private final Integer number;

    public AccountNumber(Integer number) {
        if (number == null) throw new ValidationException("Account number cannot be null.");
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
