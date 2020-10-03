package lections.lesson5.chain;


import lections.lesson5.Human;

public class Application {

    public static void main(String[] args) {
        try {
            Human[] humans = new Human[Integer.MAX_VALUE];
        } catch (OutOfMemoryError error) {
            System.out.println(error.getMessage());
        }
    }

}
