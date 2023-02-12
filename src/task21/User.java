package az.coder.task1.task21;

import java.time.LocalDate;

public class User {
    String name;
    String surName;
    LocalDate birthdate;
    LocalDate expDate;

    public User(String name, String surName, LocalDate birthdate, LocalDate expDate) {
        this.name = name;
        this.surName = surName;
        this.birthdate = birthdate;
        this.expDate = expDate;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
