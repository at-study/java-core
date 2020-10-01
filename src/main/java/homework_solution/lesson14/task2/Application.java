package homework_solution.lesson14.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        BiFunction<Passport, Place, Person> personCreator = Person::new;
        Function<Passport, Person> personWithoutPlaceCreator = Person::new;

        Function<Map.Entry<Passport, Place>, Person> mapCreateor = entry -> new Person(entry.getKey(), entry.getValue());

        Person person1 = personCreator.apply(new Passport("1234", "567890"), new Place("ул. Докукина, д.5"));
        Person person2 = personWithoutPlaceCreator.apply(new Passport("5678", "123412"));

        Map<Passport, Place> map = new HashMap<>();
        map.put(new Passport("0000", "000000"), new Place("ул. Докукина, д.1"));
        map.put(new Passport("0001", "000001"), new Place("ул. Докукина, д.2"));
        map.put(new Passport("0002", "000002"), new Place("ул. Докукина, д.3"));
        map.put(new Passport("0003", "000003"), new Place("ул. Докукина, д.4"));
        map.put(new Passport("0004", "000004"), new Place("ул. Докукина, д.5"));
        map.put(new Passport("0005", "000005"), new Place("ул. Докукина, д.6"));

        List<Passport> passports = Arrays.asList(
                new Passport("1234", "123456"),
                new Passport("1235", "123456"),
                new Passport("2345", "123456"),
                new Passport("2346", "123456"),
                new Passport("2347", "123456"));


        List<Person> persons = passports.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        // Для каждого человека из списка person
        // выведем данные о паспорте в формате серия:номер

        persons.forEach(p -> System.out.printf("%s:%s%n", p.getPassport().getSeries(), p.getPassport().getNumber()));
        System.out.println();

        // Паспорта, начинающиеся серией на "2"

        persons.stream()
                .map(Person::getPassport)
                .filter(pass -> pass.getSeries().startsWith("1"))
                .forEach(System.out::println);
    }

}
