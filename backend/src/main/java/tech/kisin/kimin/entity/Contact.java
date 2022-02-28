package tech.kisin.kimin.entity;

import java.util.Date;

public class Contact {
    private AccountNumber accountNumber;
    private Username username;
    private Date addTime;

    public Contact(AccountNumber accountNumber, Username username, Date addTime) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.addTime = addTime;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
