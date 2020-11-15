package lections.lesson13.method_references;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Application {

    @FunctionalInterface
    public interface Assert {
        void process(Object obj1, Object obj2);
    }


    public static void main(String[] args) {
        Consumer printer = (obj) -> System.out.println(obj);

        Consumer printer2 = System.out::println;

        printer2.accept("zxcvbn");

        Assertions.assertEquals("str1", "str1");
        Assert equals = Assertions::assertEquals;
        Assert equals1 = (obj1, obj2) -> Assertions.assertEquals(obj1, obj2);


        List<String> strings = Arrays.asList("ааааа", "ввввв", "ббббб", "ддддд", "ггггг");
        Comparator<String> comparator =
                (str1, str2) -> str2.compareTo(str1);
        strings.sort(comparator);
        strings.forEach(System.out::println);

    }
}
