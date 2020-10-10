package lections.lesson6faq.lesson5task4;

import lections.lesson6faq.lesson5task4.exceptions.AgeTooHighException;
import lections.lesson6faq.lesson5task4.exceptions.AgeUnderZeroException;

public class Cat {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0)
                throw new AgeUnderZeroException();
        } catch (AgeUnderZeroException exception) {
            System.out.println(exception.getStackTrace()[0]);
        }
        if (age > 20)
            throw new AgeTooHighException();

        this.name = name;
        this.age = Math.max(age, 0);
    }
}
