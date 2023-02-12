package az.coder.task1.task22;

import java.time.LocalDate;

public class User {
    Integer id;
    String name;
    String surName;
    public LocalDate birthdate;
    Double paidAmount;

    public User(Integer id, String name, String surName, LocalDate birthdate, Double paidAmount) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.birthdate = birthdate;
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthdate=" + birthdate +
                ", paidAmount=" + paidAmount +
                '}';
    }
    /*public Integer getId() {
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }*/
}
