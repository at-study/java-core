package lections.lesson4;

public class Singleton {

    private static Singleton instance;
    public int value = 5;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
