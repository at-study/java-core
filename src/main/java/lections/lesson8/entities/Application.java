package lections.lesson8.entities;

public class Application {


    public static void main(String[] args) {
        Entity user = new User();
        user = generateEntity(user);

    }


    public static Entity generateEntity(Entity entity) {
        return entity.generate();
    }

}
