package az.coder.task1.StreamApi;

public class Users {
    String name;
    String surName;
    Integer age;

    public Users(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
