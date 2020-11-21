package tests.lesson14.stream_api_terminal;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnyMatchStream {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void anyMatch() {
        boolean result = persons.stream()
                .skip(500)
                .anyMatch(person -> person.getFirstName().equals("Сергей"));
        // stream.size() == 0 -> false
        System.out.println(result);
    }

    @Test
    public void allMatch() {
        boolean result = persons.stream()
                .allMatch(person -> person.getLastName().matches("^[А-Я]([а-я])+$"));
        System.out.println(result);
    }

    @Test
    public void noneMatch() {
        boolean result = persons.stream()
                .noneMatch(person -> person.getLastName().matches("^([а-я])+$"));
        System.out.println(result);
    }



}
