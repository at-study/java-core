package homework_solution.lesson7.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ThreeHashMap<Integer, Person, Passport> data = new ThreeHashMap<>();

        System.out.println("Пустая структура: " + data.isEmpty());
        System.out.println("Размер данных: " + data.size());

        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            Passport passport = new Passport();
            data.put(i, person, passport);
            System.out.printf("Добавляем запись: id = %d, %s %s, %s %s%n", i,
                    person.getLastName(), person.getLastName(), passport.getSeries(), passport.getNumber());
        }
        System.out.println("Пустая структура: " + data.isEmpty());
        System.out.println("Размер данных: " + data.size());
        Integer randomId = new Random().nextInt(10);
        System.out.printf("Случайная запись: id = %d, %s %s, %s %s%n", randomId,
                data.getFirst(randomId).getLastName(), data.getFirst(randomId).getFirstName(),
                data.getSecond(randomId).getSeries(), data.getSecond(randomId).getNumber());

        Map<Integer, Person> persons = new HashMap<>();
        Map<Integer, Passport> passports = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            persons.put(i + 10, new Person());
            passports.put(i + 20, new Passport());
        }
        System.out.println("Добавляем сгенерированные отдельно мапы людей и паспортов");
        data.putAll(persons, passports);
        System.out.println("Для точки останова и проверки остальных методов в Evaluate");
    }
}
