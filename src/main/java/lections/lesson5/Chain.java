package lections.lesson5;

public class Chain {

    public static void main(String[] args) {
        new Chain().a();
    }

    public void a() {
        b();
    }

    public void b() {
        c();
    }

    public void c() {
        d();
    }

    public void d() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException rte) {
            StackTraceElement element = rte.getStackTrace()[1];
        }
    }
}
