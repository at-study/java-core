package tests.lesson14.stream_api_terminal;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Passport;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectStream {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void collectorsTest() {
        List<Person> personList = persons.stream()
                .collect(Collectors.toList());

        Set<Person> personSet = persons.stream()
                .collect(Collectors.toSet());

        Map<Person, Passport> personToPassportMap = persons
                .stream()
                .filter(person -> person.getPassport() != null)
                .collect(Collectors.toMap(
                        person -> person, // функция, определяющая ключи
                        person -> person.getPassport() // функция, определяющая значения
                ));
    }

}
