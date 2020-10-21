package lections.lesson9.human_fabric;

public class Teen extends Human {

    public Teen(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return String.format("Я тинейджер, мне %d лет", age);
    }
}
