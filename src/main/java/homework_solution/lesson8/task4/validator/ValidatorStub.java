package homework_solution.lesson8.task4.validator;

import homework_solution.lesson8.task4.entities.Entity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ValidatorStub {
    private static final Set<Entity> entities = new HashSet<>();

    public static void validateEntity(Entity entity) {
        if (entities.contains(entity)) {
            for (Entity stubEntity : entities) {
                if (stubEntity.equals(entity)) {
                    Long id = stubEntity.getId();
                    entity.setId(id);
                    break;
                }
            }
        } else {
            Long id = new Random().nextLong();
            entity.setId(id);
            entities.add(entity);
        }
    }

}
