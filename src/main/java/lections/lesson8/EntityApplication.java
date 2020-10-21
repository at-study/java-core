package lections.lesson8;

public class EntityApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        Entity entity = new Entity(15, "Имя сущности");

        Entity entity2 = (Entity) entity.clone();
        System.out.println();
    }
}
