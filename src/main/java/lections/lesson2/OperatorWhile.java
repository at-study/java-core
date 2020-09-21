package lections.lesson2;

import java.util.Random;

public class OperatorWhile {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Оператор while
        // Выполняет цикл, пока выполняется условие

        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index++] + " ");
        }

        System.out.println();

        index = 0;
        int[] randomNumbers = new int[20];
        while (index < randomNumbers.length) {
            randomNumbers[index] = new Random().nextInt(10);
            System.out.print(randomNumbers[index++] + " ");
        }

        System.out.println();

        // Использование break

        index = 0;
        while (true) {
            randomNumbers[index] = new Random().nextInt(10);
            System.out.print(randomNumbers[index++] + " ");
            if (index == randomNumbers.length)
                break;
        }

    }

}
