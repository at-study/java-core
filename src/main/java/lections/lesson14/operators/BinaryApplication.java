package lections.lesson14.operators;

import java.util.function.BinaryOperator;

public class BinaryApplication {

    public static void main(String[] args) {
        BinaryOperator<Integer> multiplier =
                (int1, int2) -> int1 * int2;

        BinaryOperator<Boolean> comparator =
                (boolean1, boolean2) -> boolean1.equals(boolean2);

    }

}
