package lections.lesson13.generators;

public class Application3 {

    @FunctionalInterface
    public interface Animal {

        String move(String s, int x);

        default void voice() {
            System.out.println("рррр");
        }

    }

    public static void main(String[] args) {
        Animal otherAnimal = (string, number) -> string + ":" + number;
        System.out.println(otherAnimal.move("Барсик", 10));
    }

}
