package lections.lesson2;

public class Array {


    public static void main(String[] args) {
        // Объявление массивов
        int[] array = new int[5];
        int[] array2 = {1, 2, 3, 4};

        // Обращение к элементу
        array[0] = 2;
        array[1] = 3;
        array[2] = 2;
        array[3] = 1;

        System.out.println(array[3]);
        System.out.println(array2);

        // Двумерный массив
        int[][] massive = new int[3][4];
        int[][] massive2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

}
