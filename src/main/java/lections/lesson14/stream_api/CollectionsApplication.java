package lections.lesson14.stream_api;

import java.util.Arrays;
import java.util.List;

public class CollectionsApplication {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Строка10", "Строка0", "Строка333", "Строка", "Строка2");

        list.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .forEach(s1 -> System.out.println(s1));


    }
}
