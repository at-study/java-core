package lections.lesson4;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat() {

    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public Cat setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
