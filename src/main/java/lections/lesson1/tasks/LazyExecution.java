package lections.lesson1.tasks;

public class LazyExecution {

    public static void main(String[] args) {
        LazyExecution instance = new LazyExecution();
        boolean d = !instance.a() && instance.b() || !instance.c();
    }

    /**                  И         ИЛИ
     * true  true      true        true
     * true  false     false       true
     * false true      false       true
     * false false     false       false
     */

    boolean a() {
        System.out.print("A");
        return true;
    }

    boolean b() {
        System.out.print("B");
        return true;
    }

    boolean c() {
        System.out.print("C");
        return true;
    }
}
