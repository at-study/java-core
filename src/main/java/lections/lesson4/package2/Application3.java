package lections.lesson4.package2;

import lections.lesson4.package1.Application;

public class Application3 {

    public static void main(String[] args) {
        Application instance = new Application();
        // instance.c; <-- Поля default недоступны из других пакетов.

        //Application.defaultMethod(); Метод default надоступен из других пакетов.
    }

}
