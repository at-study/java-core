package lections.lesson14.functions;

import homework_solution.lesson10.task4.helpers.StringGenerator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {
        Function<String, Integer> lengthFunction =
                str -> str.length();
        Function<String, Integer> lengthFunction2 =
                String::length;

        Function<Integer, String> randomStringFunction =
                length -> StringGenerator.generate(length, "ABCDEF");

        Function<Boolean, Boolean> negateBooleanFunction =
                bool -> {
                    if (bool == null) {
                        return null;
                    }
                    return !bool;
                };

        negateBooleanFunction.apply(null);

        Function<String, String> reverser =
                (str) -> {
                    System.out.println(str);
                    return new StringBuilder(str).reverse().toString();
                };
        System.out.println(reverser.apply("TestString"));

        BiFunction<String, Boolean, String> conditionalReverser =
                (str, condition) ->
                        condition
                                ? new StringBuilder(str).reverse().toString()
                                : str;

        System.out.println(conditionalReverser.apply("MyNewStr", true));
        System.out.println(conditionalReverser.apply("MyNewStr", false));
    }

}
