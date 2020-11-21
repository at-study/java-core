package tests.lesson14.stream_api_terminal;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindFirstAnyStream {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void findFirst() {
        persons.stream()
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Stream is empty"));
    }
}
