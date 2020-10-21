package lections.lesson8;

public class Entity {
    private int id;
    private String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
