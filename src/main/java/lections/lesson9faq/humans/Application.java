package lections.lesson9faq.humans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Human human = new Human();
            humans.add(human);
        }

        Set<Human> uniqueHumans = new TreeSet<>();

        for (Human human : humans) {
            for (Human otherHuman: humans) {
                if (human != otherHuman && human.equals(otherHuman))
                    uniqueHumans.add(human);
            }
        }

        for (Human human : uniqueHumans)
            System.out.println(human);



    }

}
