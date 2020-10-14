package lections.lesson7.polymorphism;

public class Bird extends Animal {

    public void fly() {
        System.out.println("Птицы летают, ходить не любят");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void voice() {
        System.out.println("Птичий звук");
    }
}
