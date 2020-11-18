package lections.lesson14.optional.model;

import java.util.Random;

public class House {
    private int number;

    public House() {
        number = new Random().nextInt(20);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
