package az.coder.task1.BirBankApp.User;

import java.time.LocalDate;

public class User {
    /*private*/  public  Integer id;
    /*private*/  public  String name;
    /*private*/  public  String surName;
    /*private*/  public  Integer pin;
    /*private*/  public  LocalDate birthDate;

    public User(Integer id, String name, String surName, Integer pin, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.pin = pin;
        this.birthDate = birthDate;
    }
    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", surName=" + surName +
                ", pin=" + pin +
                ", birthDate=" + birthDate +
                '}';
    }
}
