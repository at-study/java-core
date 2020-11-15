package lections.lesson13.lambdas;

public class Application {

    @FunctionalInterface
    public interface Calculator {

        int calculate(int number1, int number2);

    }

    public static void main(String[] args) {
        Calculator summ = (n1, n2) -> n1 + n2;
        Calculator multiply = (n1, n2) -> n1 * n2;
        System.out.println(summ.calculate(5, 3));

    }
}
