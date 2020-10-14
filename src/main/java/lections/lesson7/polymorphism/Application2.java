package lections.lesson7.polymorphism;

public class Application2 {

    private static class A {
        void a() {

        }
    }

    private static class B extends A {

        @Override
        void a() {

        }

        void b() {

        }
    }

    private static class C extends B {

        @Override
        void a() {

        }

        void c() {

        }
    }

    private static class D extends C {
        void d() {

        }
    }

    //   A
    //   ^
    //   B
    //   ^
    //   C
    //   ^
    //   D
    //
    public static void main(String[] args) {
        A object1 = new A();
        A object2 = new B();
        A object3 = new C();
        A object4 = new D();

        // B object5 = new A(); <- нельзя
        B object6 = new B();
        B object7 = new C();
        B object8 = new D();

        C object9 = new C();
        C object10 = new D();
        D object11 = new D();


        C object3c = (C) object3;
        object3c.a();
        object3c.b();
        object3c.c();

    }

}
