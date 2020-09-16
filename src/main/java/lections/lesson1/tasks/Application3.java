package lections.lesson1.tasks;

public class Application3 {

    public static void main(String[] args) {
        int value = 2147483647;
        value += 1;
        System.out.println(value);

        short shortValue = 32767;
        shortValue += 1;
        System.out.println(shortValue);

        char ch = 'A';
        ch += 1;
        System.out.println(ch);

        long x = 4_147_493_647L;
        int y = (int) x;
        System.out.println(y);

        boolean e = false;
        boolean f = !e;
        System.out.println(f);
                    // = (условие) ? (если true) : (если false) ;
        int ternary = !(4 > 3) ? 4 : 3;
        System.out.println(ternary);
    }

}
