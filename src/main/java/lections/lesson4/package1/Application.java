package lections.lesson4.package1;

public class Application {
    // Приватные - видны в том же самом классе
    private int a = 0;
    // Публичные - видны везде
    public int b = 0;
    // Default - видны в пределах пакета
    int c = 0;
    // Protected - видны в пределах пакета и у наследников.
    protected int d = 0;




    private static void privateMethod() {
        System.out.println("Приватный метод");
    }

    private static void privateMethod2() {
        privateMethod();
        System.out.println("Приватный метод 2");
        // Application2.privateMethod3(); <- Не виден, т.к. находится в другом классе
    }

    public static void publicMethod() {
        System.out.println("Публичный метод");
    }

    static void defaultMethod() {
        System.out.println("Метод с модификатором доступа по умолчанию");
    }

}
