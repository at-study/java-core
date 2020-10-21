package lections.lesson8.interfaces;

public class Bird implements Flyable, Movable, CanEat {

    @Override
    public void fly() {
        System.out.println("птица летит");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void eat() {
        System.out.println("Птица что-то ест");
    }

}
