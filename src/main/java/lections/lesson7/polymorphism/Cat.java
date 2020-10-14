package lections.lesson7.polymorphism;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

}
