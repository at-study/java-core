package lections.lesson1;

public class ClassWithMethod2 {

    int radius = 5;
    int i = 1;

    public static void main(String[] args) {
        ClassWithMethod2 instance = new ClassWithMethod2();
        System.out.println(instance.getSquare(4));
        int i = 3;
        instance.calculate(i);
        System.out.println(i);
    }

    double getSquare(int radius) {
        return 3.1416 * radius * radius;
    }

    int getSquare(int width, int height) {
        return width * height;
    }

    void calculate(int i) {
        i = 2;
    }

}
