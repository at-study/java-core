package tests.lesson14;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Card;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LessonTasks {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void someTasks() {
        long count = persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getProperties().size() == 3)
                .peek(person -> System.out.printf("%s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(3, count);
    }

    @Test
    void test2() {
        long count = persons.stream()
                .filter(person -> person.getLastName().equals("Васильев"))
                .filter(person -> person.getCards().size() != person.getAccounts().size())
                .peek(person -> System.out.printf("%s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, count);
    }

    @Test
    void test3() {
        Person result = persons.stream()
                .filter(person -> person.getPassport() != null)
                .skip(49)
                .limit(50)
                .filter(person -> person.getCards().size() == 2)
                .filter(person -> person.getAccounts().size() == 3)
                .findFirst()
                .orElse(persons.get(0));
        System.out.printf("%s %s %s%n",
                result.getLastName(), result.getFirstName(), result.getPatronymic());
        result.getAccounts().forEach(account -> System.out.printf("%s ", account.getAccountNumber()));
        System.out.println();
        result.getCards().forEach(card -> System.out.printf("%s ", card.getCardNumber()));
    }

    @Test
    void test4() {
        long count = persons.stream()
                .flatMap(person -> person.getProperties().stream())
                .count();

        long count2 = persons.stream()
                .map(person -> person.getProperties().size()) // [list, list, list]
                // .map(properties -> properties.size())   // [size, size, size]
                .reduce((size1, size2) -> size1 + size2)  // [int + int + int -> int]
                .get();
        Assertions.assertEquals(974, count);
    }


    @Test
    public void someActions() {
        List<Object> objects = null; // "cards" : null,
        List<Object> objects1 = new ArrayList<>(); // "cards": []

        long personWithCardsAmount = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .count();

        long personWithOnlyActiveCardsAmount = persons.stream()
                .map(Person::getCards)   // [listcard,listcard,listcard]
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().allMatch(this::isCardValid))
                .count();

        long personWithOnlyExpiredCardsAmount = persons  // List<Person>
                .stream() // Stream<Person>
                .map(person -> person.getCards())   // Stream<List<Card>>
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().noneMatch(this::isCardValid)) // Stream<Card>.noneMatch
                .count();

        long otherPersons = persons.stream()
                .map(Person::getCards)
                .filter(cards -> !cards.isEmpty())
                .filter(cards -> cards.stream().anyMatch(this::isCardValid))
                .filter(cards -> cards.stream().anyMatch(card -> !isCardValid(card)))
                .count();

        System.out.printf("%d %d %d %d", personWithCardsAmount, personWithOnlyActiveCardsAmount, personWithOnlyExpiredCardsAmount, otherPersons);
        Assertions.assertEquals(personWithCardsAmount, personWithOnlyActiveCardsAmount + personWithOnlyExpiredCardsAmount + otherPersons);

        persons
                .stream() //Stream<Person>
                .map(person -> person.getPassport()) //Stream<Passport>
                .peek(passport -> System.out.println(passport))
                .filter(passport -> passport != null)
                .collect(Collectors.toMap(
                        passport -> passport.getNumber(),
                        passport -> passport.getSeries()
                ));
    }

    private boolean isCardValid(Card card) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.yy");
        try {
            Date cardDate = sdf.parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException pe) {
            throw new RuntimeException();
        }
    }

}
