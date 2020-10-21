package lections.lesson9.human_fabric;

public class RegularHuman extends Human {

    public RegularHuman(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return String.format("Я молодой человек, мне %d лет", age);
    }
}
