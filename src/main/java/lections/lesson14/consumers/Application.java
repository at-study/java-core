package lections.lesson14.consumers;

import org.junit.jupiter.api.Assertions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {
        Consumer<String> print = (input) -> System.out.println(input);
        Consumer<String> print2 = System.out::println;

        Consumer<Boolean> asserter = checkBoolean -> Assertions.assertTrue(checkBoolean);

        print.accept("123");
        asserter.accept(true);


        BiConsumer<String, String> printer =
                (str1, str2) -> {
                    System.out.println(str1);
                    System.out.println(str2);
                };

        printer.accept("1234", "5678");

    }

}
