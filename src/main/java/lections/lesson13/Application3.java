package lections.lesson13;

public class Application3 {

    public static void main(String[] args) {
        Object object = new Object() {

            @Override
            public String toString() {
                return "toString() анонимного класса";
            }

        };

        System.out.println(object);
    }

}
