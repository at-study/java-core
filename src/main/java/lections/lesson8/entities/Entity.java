package lections.lesson8.entities;

public interface Entity {

    Entity generate();

    void delete();

    void modify(Entity entity);

    Entity get();

    default Entity getOrGenerate() {
        if (get() == null)
            return generate();
        else
            return get();
    }

}
