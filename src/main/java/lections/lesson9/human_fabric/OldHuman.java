package lections.lesson9.human_fabric;

public class OldHuman extends Human {

    public OldHuman(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return String.format("Я старый человек, мне %d лет", age);
    }
}
