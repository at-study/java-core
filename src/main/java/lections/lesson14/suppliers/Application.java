package lections.lesson14.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier =
                () -> new Random().nextInt(101);

        System.out.println(randomNumberSupplier.get());

        Supplier<Application> instanceSupplier =
                () -> new Application();
        Supplier<Application> instanceSupplier2 =
                Application::new;

    }

}
