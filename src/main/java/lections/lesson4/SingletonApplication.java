package lections.lesson4;

public class SingletonApplication {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        singleton.value = 3;
        System.out.println();
    }

}
