package lections.lesson1.tasks;

public class Triangle {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        Triangle instance = new Triangle();
        if (instance.allDimensionsEquals(a, b, c))
            System.out.println("Треугольник равносторонний");
        if (instance.twoDimensionsEquals(a, b, c))
            System.out.println("Треугольник равнобедренный");
        if (!instance.allDimensionsEquals(a, b, c) && !instance.twoDimensionsEquals(a, b, c))
            System.out.println("Треугольник произвольный");
    }

    boolean allDimensionsEquals(int a, int b, int c) {
        return (a == b && a == c);
    }

    boolean twoDimensionsEquals(int a, int b, int c) {
        return (a == b || b == c || a == c) && !allDimensionsEquals(a, b, c);
    }

}
