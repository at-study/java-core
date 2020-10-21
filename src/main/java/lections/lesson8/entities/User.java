package lections.lesson8.entities;

public class User extends AbstractEntity {



    @Override
    public Entity generate() {
        return new User();
    }

    @Override
    public void delete() {
        // Запрос к БД на удаление пользователя
    }

    @Override
    public void modify(Entity entity) {
        // Запрос к БД на изменение пользователя
    }

    @Override
    public Entity get() {
        // Запрос к БД на получение пользователя
        return null;
    }
}
