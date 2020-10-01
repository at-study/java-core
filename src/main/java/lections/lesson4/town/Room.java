package lections.lesson4.town;

public class Room {
    private int x;
    private int y;

    public Room() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Room setX(int x) {
        this.x = x;
        return this;
    }

    public Room setY(int y) {
        this.y = y;
        return this;
    }
}
