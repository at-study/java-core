package lections.lesson7.overloading;

public class Cat extends BaseCat {

    public int getSomething() {
        return 0;
    }

    @Override
    public int getSomething(int a) {
        return a;
    }

    public int getSomething(int a, int b) {
        return a + b;
    }

}
