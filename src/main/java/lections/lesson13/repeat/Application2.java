package lections.lesson13.repeat;

import lections.lesson13.generators.Birds;
import org.junit.jupiter.api.Assertions;

public class Application2 {

    public interface Generatable<T> {
        T generate();

        T getExisting();

        default T process() {
            T existing = getExisting();
            return (existing == null)
                    ? generate()
                    : existing;
        }
    }

    private static Birds.Chicken bird;

    public static void main(String[] args) {
        Generatable<Birds.Chicken> generator = new Generatable<Birds.Chicken>() {
            @Override
            public Birds.Chicken generate() {
                bird = new Birds.Chicken();
                return bird;
            }

            @Override
            public Birds.Chicken getExisting() {
                return bird;
            }
        };

        Assertions.assertEquals(generator.process(), generator.process());

    }

}
