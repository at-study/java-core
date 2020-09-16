package lections.lesson1;

public class ClassWithMethod {

    int radius = 5;

    public static void main(String[] args) {
        ClassWithMethod instance = new ClassWithMethod();
        // System.out.println(instance.getSquare());
        instance.printSquare();
    }

    double getSquare() {
        return 3.1416 * radius * radius;
    }

    void printSquare() {
        double square = 3.1416 * radius * radius;
        System.out.println(square);
    }


}
