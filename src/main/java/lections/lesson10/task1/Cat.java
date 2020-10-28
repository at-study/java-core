package lections.lesson10.task1;

import homework_solution.lesson10.task4.helpers.StringGenerator;

import java.util.Random;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        name = StringGenerator.generate(10, "ABCDEFGHIJ");
        age = new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
