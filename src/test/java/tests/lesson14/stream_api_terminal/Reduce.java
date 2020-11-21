package tests.lesson14.stream_api_terminal;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void reduceTest() {
        int result = Stream.of(2, 3, 4, 5)
                .reduce((i1, i2) -> i1 + i2).get();

        int result2 = Stream.of(2, 3, 4, 5)
                .reduce((i1, i2) -> i1 * i2).get();

        System.out.println(result);
        System.out.println(result2);

        String result3 = Stream.of("str1", "str2", "str3")
                .reduce((s1, s2) -> s1 + s2).get();
    }
}
