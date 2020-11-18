package lections.lesson14.operators;

import java.util.function.UnaryOperator;

public class UnaryApplication {

    private static class Cat {

        private String name;

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        UnaryOperator<String> reverser =
                (str) -> {
                    System.out.println(str);
                    return new StringBuilder(str).reverse().toString();
                };
        System.out.println(reverser.apply("TestString"));

        UnaryOperator<Cat> catNameSetter =
                cat -> {
                    cat.setName("Барсик");
                    return cat;
                };

        Cat cat = new Cat();
        catNameSetter.apply(cat);

        System.out.println(cat.name);
    }

}
