package lections.lesson8.entities;

public class Branch extends AbstractEntity {

    @Override
    public Entity generate() {
        return new Branch();
    }

    @Override
    public void delete() {

    }

    @Override
    public void modify(Entity entity) {

    }

    @Override
    public Entity get() {
        return generate();
    }
}
