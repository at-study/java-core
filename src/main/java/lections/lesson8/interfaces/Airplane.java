package lections.lesson8.interfaces;

public class Airplane implements Flyable, Movable {

    @Override
    public void fly() {
        System.out.println("Самолет летит в другой город");
    }

    @Override
    public void move() {
        fly();
    }

}
