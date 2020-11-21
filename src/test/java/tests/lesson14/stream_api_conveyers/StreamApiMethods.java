package tests.lesson14.stream_api_conveyers;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Account;
import homework_solution.lesson14.model.Passport;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethods {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void someMethodTest() {
        List<Person> personList = persons.stream()
                .filter(person -> person.getLastName().matches("^([А-Я])([а-я]+)$"))
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getProperties().size() == 3)
                .filter(person -> person.getProperties().stream()
                        .anyMatch(property -> property.getAddress().contains("Докукина")))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(personList.size());
        personList.forEach(person -> {
            System.out.printf("%s %s %d%n", person.getLastName(), person.getPassport().getNumber(), person.getProperties().size());
            person.getProperties().forEach(property -> System.out.printf("\t%s%n", property.getAddress()));
        });
    }

    @Test
    public void mapTest() {
        List<Passport> passports = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getPassport())
                .collect(Collectors.toList());

        List<List<Account>> accounts = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getAccounts())
                .collect(Collectors.toList());

        List<Account> allAccounts = persons.stream()
                .filter(person -> person.getPassport() != null)
                .flatMap(person -> person.getAccounts().stream())
                .collect(Collectors.toList());

    }

}
