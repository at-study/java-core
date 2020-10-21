package lections.lesson9.human_fabric;

public class HumanFabric {

    public static Human getHumanByAge(int age) {
        if (age >= 13 && age <= 19)
            return new Teen(age);
        if (age >= 20 && age <= 60)
            return new RegularHuman(age);
        if (age >= 61)
            return new OldHuman(age);
        throw new IllegalArgumentException("illegal age");
    }

}
