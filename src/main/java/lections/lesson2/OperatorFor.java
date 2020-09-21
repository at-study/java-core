package lections.lesson2;

public class OperatorFor {

    public static void main(String[] args) {
        int x = 1;
        int y = x--;
        System.out.printf("x = %d, y = %d%n", x, y);

        int[] array = new int[6];

        // Цикл for
        for (int i = 0; i < 6; i++) {
            array[i] = i;
        }

        // Вывод массива на экран
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        // Максимальный элемент
        int[] newArray = {1, 9, 11, 5, 10, -2, 6, 12, 3};
        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++)
            max = Math.max(max, newArray[i]);
        System.out.println(max);

        // Цикл For Each
        int min = newArray[0];
        for (int current : newArray) {
            min = Math.min(min, current);
        }
        System.out.println(min);


        // Шахматная доска
        // 1,2,3,4,5,6,7,8
        // A,B,C,D,F,E,G,H

        // A1 A2 A3 A4 ... A8
        // B1 B2 B3 .. ... B8
        // ....
        // H1 ...          H8
        for (char j = 'A'; j <= 'H'; j++) {
            for (int i = 1; i <= 8; i++)
                System.out.print(String.valueOf(j) + i + " ");
            System.out.println();
        }

        // Имеется массив целых чисел
        // Посчитать сумму положительных элементов.
        int[] massive = {5, 6, 7, 8, 9, -2, 0, 4, -7};
        int summ = 0;
        for (int i = 0; i < massive.length; i++)
            if (massive[i] > 0)
                summ += massive[i];
        System.out.printf("Сумма положительных элементов массива: %d%n", summ);

        // break и continue
        // break - служит для выхода из цикла до его завершения.
        // continue - вызывает новую итерацию в цикле, не завершая предыдущую.

        // for (int i = 0; i<5; i++) {
        //       Код (А)
        //       continue;
        //       Код (Б)
        // }
        // При выполнении continue будет новая итерация без выполнения кода Б.

        // Определить, есть ли в массива числа, больше 100


        int[] bigArray = {15, 17, 98, 95, 44, 75};
        boolean hasValueAbove100 = false;
        for (int i = 0; i < bigArray.length; i++) {
            System.out.println("Текущее число для проверки: " + bigArray[i]);
            if (bigArray[i] > 100) {
                hasValueAbove100 = true;
                break;
            }
        }

        System.out.println(hasValueAbove100);

        // Для каждой строки двумерного массива определить, есть ли в строке числа, больше 100

        int[][] numbers = {{19, 55, 80}, {55, 105, 15}, {25, 109, 15}};

        for (int i = 0; i < numbers.length; i++) {
            boolean lineHasNumber = false;
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] >= 100) {
                    System.out.printf("В строке номер %d есть число > 100%n", i);
                    lineHasNumber = true;
                    break;
                }
            }
            if (!lineHasNumber) System.out.printf("В строке номер %d нет числа > 100%n", i);
        }


        // Определить, есть ли в массива числа, больше 100
        boolean arrayHasValue100 = false;
        for (int i = 0; i < bigArray.length; i++) {
            if (bigArray[i] <= 100)
                continue;
            arrayHasValue100 = true;
        }

        System.out.println(arrayHasValue100);


        // Имеется массив строк
        // Нужно посчитать количество слов, длина которых меньше 5
        // до первой строки длиной больше 8.

        // Длина < 5            -> stringCount++;
        // 5 <= Длина <= 8      -> continue;
        // Длина > 8            -> break;

        String[] stringArray = {"аааа", "ббббб", "вввв", "ггг", "дддддддддд", "еее"};
        int stringCount = 0;
        for (String string : stringArray) {
            if (string.length() >= 5) {
                if (string.length() <= 8) {
                    continue;
                } else break;
            }
            stringCount++;
        }
        System.out.println("String Count: " + stringCount);
    }

}
