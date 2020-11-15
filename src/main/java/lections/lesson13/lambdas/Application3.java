package lections.lesson13.lambdas;

import org.junit.jupiter.api.Assertions;

import java.util.Date;

public class Application3 {

    public static class Cat {
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    public static class Dog {

    }

    public static void main(String[] args) {
        Processor<Boolean, Object, Object> classComparator =
                (key1, key2) -> key1.getClass().equals(key2.getClass());

        Object obj1 = new Cat();
        Object obj2 = new Dog();

        Boolean result = classComparator.process(obj1, obj2);
        System.out.println(result);

        // process("str", 3)      result = "strstrstr"

        Processor<String, String, Integer> stringRepeater = (k1, k2) -> {
            StringBuilder lambdaResult = new StringBuilder();
            for (int i = 0; i < k2; i++) {
                lambdaResult.append(k1);
            }
            return lambdaResult.toString();
        };

        long before = new Date().getTime();
        String repeatedString = stringRepeater.process("za", 50000);
        System.out.println(repeatedString);
        long after = new Date().getTime();
        System.out.println("Operation time: " + (after - before) + " ms");

        Processor<Void, Object, Object> objectEqualsProcessor =
                (object1, object2) -> {
                    Assertions.assertEquals(object1, object2);
                    return null;
                };
        objectEqualsProcessor.process("str1", "str1");


    }

}
