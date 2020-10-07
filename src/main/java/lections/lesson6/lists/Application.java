package lections.lesson6.lists;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("строка1");
        strings.add("строка2");
        strings.add("строка3");
        strings.add(1, "строка4");

        strings.set(2, "строка5");

        strings.remove(3);
        strings.remove("строка1");

        boolean isEmpty = strings.isEmpty();
        int size = strings.size();

        strings.add("строка3");
        strings.add("строка6");
        strings.add("строка3");

        int index = strings.indexOf("строка3");
        int lastIndex = strings.lastIndexOf("строка3");

        boolean contains = strings.contains("строка3");
        Object[] array = strings.toArray();

        String string = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println();

        for (String str : strings){
            System.out.println(str);
        }



    }

}
