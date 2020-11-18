package lections.lesson14.stream_api;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;

import java.util.List;

public class HumanApplication {

    public static void main(String[] args) {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json").subList(0, 500);

        // Сортируем по фамилии
        // Если фамилии одинаковые
        // Сортируем по имени
        // Если имена одинаковые
        // Сортируем по отчеству

        persons.stream()
                .sorted((person1, person2) -> {
                            if (!person1.getLastName().equals(person2.getLastName())) {
                                return person1.getLastName().compareTo(person2.getLastName());
                            }
                            if (!person1.getFirstName().equals(person2.getFirstName())) {
                                return person1.getFirstName().compareTo(person2.getFirstName());
                            }
                            return person1.getPatronymic().compareTo(person2.getPatronymic());
                        }
                )
                .forEach(person -> System.out.printf("%s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic()));

    }
}
