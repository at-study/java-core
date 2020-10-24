package lections.lesson9faq.extimpl;

public class TwoInterfacesApplication {

    private interface AInterface {
        default void a() {
            System.out.println("default A");
        };
    }

    private interface BInterface {
        default void a() {
            System.out.println("default B");
        };
    }

    private static class AClass implements AInterface, BInterface {

        @Override
        public void a() {

        }

    }

    public static void main(String[] args) {
        AInterface a1 = new AClass();
        a1.a();
       // BInterface b1 = new AClass();
      //  b1.a();
    }

}
