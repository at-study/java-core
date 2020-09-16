package lections.lesson1.tasks;

public class Logic {

    public static void main(String[] args) {
        // !a || !b == !(a && b)
        // !a && !b == !(a || b)
        Logic instance = new Logic();
        System.out.println(instance.notOr(true, true));
        System.out.println(instance.notOr(true, false));
        System.out.println(instance.notOr(false, true));
        System.out.println(instance.notOr(false, false));

        System.out.println(instance.notAnd(true, true));
        System.out.println(instance.notAnd(true, false));
        System.out.println(instance.notAnd(false, true));
        System.out.println(instance.notAnd(false, false));

    }

    boolean notOr(boolean a, boolean b) {
        return !a && !b;
    }

    boolean notAnd(boolean a, boolean b) {
        return !(a || b);
    }

}
