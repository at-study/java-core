package lections.lesson8.abstractclass;

public abstract class Animal {

    protected int age;
    protected int weight;


    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Animal() {

    }

    public abstract void voice();

    public abstract void move();

    public Animal getChild() {
        return null;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }

    public Animal setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

}
