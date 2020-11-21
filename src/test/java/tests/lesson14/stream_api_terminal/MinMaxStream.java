package tests.lesson14.stream_api_terminal;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinMaxStream {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void minTest() {
        Person person = persons.stream()
                .min((p1, p2) -> {
                    if (!p1.getLastName().equals(p2.getLastName())) {
                        return p1.getLastName().compareTo(p2.getLastName());
                    }
                    if (!p1.getFirstName().equals(p2.getFirstName())) {
                        return p1.getFirstName().compareTo(p2.getFirstName());
                    }
                    return p1.getPatronymic().compareTo(p2.getPatronymic());
                })
                .orElseThrow(() -> new IllegalStateException("В потоке нет персон"));
        System.out.printf("%s %s %s", person.getLastName(), person.getFirstName(), person.getPatronymic());
    }

    @Test
    public void maxTest() {
        Person person = persons.stream()
                .max((p1, p2) -> {
                    if (!p1.getLastName().equals(p2.getLastName())) {
                        return p1.getLastName().compareTo(p2.getLastName());
                    }
                    if (!p1.getFirstName().equals(p2.getFirstName())) {
                        return p1.getFirstName().compareTo(p2.getFirstName());
                    }
                    return p1.getPatronymic().compareTo(p2.getPatronymic());
                })
                .orElseThrow(() -> new IllegalStateException("В потоке нет персон"));
        System.out.printf("%s %s %s", person.getLastName(), person.getFirstName(), person.getPatronymic());
    }
}
