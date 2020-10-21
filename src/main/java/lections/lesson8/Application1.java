package lections.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {
        List<String> ourList = getStringLinkedList();

    }


    public static List<String> getStringArrayList() {
        return new ArrayList<>();
    }

    public static List<String> getStringLinkedList() {
        return new LinkedList<>();
    }


}
