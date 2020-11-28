package tests.lesson15faq;

import lections.lesson15faq.CucumberName;
import lections.lesson15faq.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class HumanTests {

    @Test
    public void someHumanTests() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        Human human = new Human();
        Field[] fields = human.getClass().getDeclaredFields();
        Field firstNameField = human.getClass().getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        firstNameField.set(human, "Иван");

        Method getFirstNameMethod = human.getClass().getDeclaredMethod("getFirstName");
        getFirstNameMethod.setAccessible(true);
        Object result = getFirstNameMethod.invoke(human);
        String resultString = (String) result;

        Assertions.assertEquals("Иван", resultString);
    }


    @Test
    public void someHumanTests2() throws IllegalAccessException {
        Human human = new Human("Иванов", "Петр");

        String lastName = (String) getFieldFromHumanByCucumberName(human, "Фамилия").get(human);
        String firstName = (String) getFieldFromHumanByCucumberName(human, "Имя").get(human);

        Assertions.assertEquals("Иванов", lastName);
        Assertions.assertEquals("Петр", firstName);
    }

    private Field getFieldFromHumanByCucumberName(Human human, String cucumberName) {
        Field annotatedField = Stream.of(human.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(CucumberName.class))
                .filter(field -> field.getAnnotation(CucumberName.class).value().equals(cucumberName))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Нет аннотации @CucumberName с значением " + cucumberName));
        annotatedField.setAccessible(true);
        return annotatedField;
    }

}
