package lections.lesson3faq;

public class VariableLifeTime {

    public static void main(String[] args) {
        boolean condition = true;
        if (condition) {
            int i = 2;
            i++;
            i = i * 2;
            if (condition) {
                int j = 1;
                j = 3;
                j *= 2;
            }
            // j = 4; <-- Здесь переменная не видна
        }
        // i = 5; <-- Здесь переменная не видна
    }
}
