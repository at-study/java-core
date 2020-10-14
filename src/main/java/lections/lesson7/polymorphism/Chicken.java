package lections.lesson7.polymorphism;

public class Chicken extends Bird {

    @Override
    public void fly() {
        throw new IllegalStateException("Летать не умею");
    }

    @Override
    public void move() {
        System.out.println("Курицы только ходят");
    }

    @Override
    public void voice() {
        System.out.println("Ко-ко-ко");
    }

}
