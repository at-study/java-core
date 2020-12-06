package lections.lesson15faq2;

import java.util.HashMap;
import java.util.Map;

public class Cat {

    public static class ChildCat extends Cat {

    }

    private String name;

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "единица");
        map.put("2", "двойка");

        map.entrySet().stream()
                .forEach(entry -> System.out.printf("%s:%s%n", entry.getKey(), entry.getValue()));
        map.keySet().stream()
                .forEach(key -> System.out.println(key));
        map.values().stream()
                .forEach(value -> System.out.println(value));
    }
}
