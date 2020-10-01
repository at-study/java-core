package tests;

import java.util.Arrays;

public class Debug {

    public void debugTest() {
        int NOT_NULL_COUNT = 2;

        Integer[] ints = {1, 3, null, null};
        Integer[] notNullInts = Arrays.copyOf(ints, NOT_NULL_COUNT);

        System.out.println();
    }
}
