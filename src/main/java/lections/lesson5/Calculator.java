package lections.lesson5;

public class Calculator {

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(divide(5, 0));
    }

}
