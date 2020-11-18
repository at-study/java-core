package lections.lesson14.stream_api;

import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        Stream.of("Семь", "Пятниц", "На", "Неделе")
                .map(string -> string.length())
                .distinct()
                .filter(number -> number >= 3)
                .forEach(number -> System.out.println(number));

    }
}
