package lections.lesson14.predicats;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Application {

    public static void main(String[] args) {
        Predicate<Integer> positive = int1 -> int1 > 0;

        Predicate<String> lengthHigherThan10 = str -> str.length() > 10;

        BiPredicate<String, Integer> lengthPredicate =
                (str, length) -> str.length() == length;

        System.out.println(lengthPredicate.test("abcdef", 6));
        System.out.println(lengthPredicate.test("abcdef", 7));
    }

}
