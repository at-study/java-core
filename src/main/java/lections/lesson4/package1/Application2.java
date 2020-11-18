package lections.lesson4.package1;

public class Application2 {

    private static void privateMethod3() {
        System.out.println("Приватный метод-3");
        // UnaryApplication.privateMethod(); <-- Приватные методы других классов недоступны.
        // UnaryApplication.privateMethod2();

        Application.publicMethod(); // <-- Публичные методы видны везде.

        Application instance = new Application();
        // int xa = instance.a; // <-- Приватные поля других классов не видны.
        int xb = instance.b;
        int xc = instance.c;

        Application.defaultMethod();
    }
}
