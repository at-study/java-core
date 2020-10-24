package lections.lesson9faq.extimpl;

public class Application {

    private interface AInterface {
        void a();
    }

    private static abstract class AClass implements AInterface {

        // public abstract void a();

    }

    private static class AImpl extends AClass {

        @Override
        public void a() {
            System.out.println("OVERRIDEN");
        }

    }

    public static void main(String[] args) {
        AInterface object = new AImpl();
        object.a();
    }

}
