package lections.lesson1;

public class Rectangle {
    int width;
    int height;

    int getSquare() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle instance = new Rectangle();
        instance.height = 4;
        instance.width = 10;

        int square = instance.getSquare();
        int perimeter = instance.getPerimeter();

        System.out.println("Площадь прямоугольника: " + square);
        System.out.println("Периметр прямоугольника: " + perimeter);

    }
}
