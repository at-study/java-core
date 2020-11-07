package lections.lesson12.inheritance_json;

public class HomeAnimal extends Animal {

    private String name;

    public HomeAnimal(String name, Integer age, Integer weight) {
        super(age, weight);
        this.name = name;
    }
}
