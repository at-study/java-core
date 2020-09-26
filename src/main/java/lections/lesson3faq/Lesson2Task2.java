package lections.lesson3faq;

public class Lesson2Task2 {

    public static void main(String[] args) {
        int[][] array = new int[8][8];

        // [0][0] = 0;
        // [0][1] = 1;
        // [0][2] = 0;
        // [1][0] = 1;
        // [1][1] = 0;
        // [3][5] = 0;

        boolean isOdd = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = isOdd ? 0 : 1;
                isOdd = !isOdd;
            }
            isOdd = !isOdd;
        }
        System.out.println("Вывод с помощью цикла For:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Вывод с помощью цикла ForEach:");
        for (int[] row : array) {
            for (int current : row) {
                System.out.print(current);
            }
            System.out.println();
        }

        System.out.println("Вывод с помощью цикла While");
        // while (condition) {}
        // for (initial; condition; actions)
        int i = 0;
        while (i < 8) {
            int j = 0;
            while (j < 8) {
                System.out.print(array[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }


    }

}
