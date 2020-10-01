package lections.lesson4;

public class SqlConnection {

    public SqlConnection() {
    }

    public SqlConnection connect() {
        System.out.println("Подключились к БД");
        return this;
    }

    public SqlConnection updateUser() {
        System.out.println("Обновили пользователя в БД");
        return this;
    }

    public SqlConnection updateClient() {
        System.out.println("Обновили организацию в БД");
        return this;
    }

    public SqlConnection disconnect() {
        System.out.println("Отключились от БД");
        return this;
    }
}
