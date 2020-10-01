package lections.lesson4;

import java.util.Date;

public class Human {
    private String name;
    private int age;
    private Date birthDate;

    Human() {

    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        if (0 <= age && age <= 140)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
