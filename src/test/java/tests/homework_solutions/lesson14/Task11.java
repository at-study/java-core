package tests.homework_solutions.lesson14;

import homework_solution.lesson14.model.Person;
import homework_task.lesson14.helpers.PersonFilterHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task11 {


    @Test
    public void testPersonFilterHelper() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();

        Assertions.assertEquals(20, persons.size());

        persons.forEach(person -> Assertions.assertNotNull(person.getPassport()));
        persons.forEach(person -> Assertions.assertEquals(3, person.getCards().size()));
        persons.forEach(person -> Assertions.assertFalse(person.getProperties().isEmpty()));
        persons.forEach(person -> {
            final double[] totalPrice = {0d};
            person.getProperties().forEach(property -> totalPrice[0] += property.getPrice());
            Assertions.assertTrue(totalPrice[0] > 20_000_000d);
        });

    }

}
