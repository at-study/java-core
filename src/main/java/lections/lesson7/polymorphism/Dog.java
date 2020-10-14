package lections.lesson7.polymorphism;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

}
