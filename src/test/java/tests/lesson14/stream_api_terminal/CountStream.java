package tests.lesson14.stream_api_terminal;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CountStream {

    @Test
    public void countTest() {
        long count = Stream.of("1", "2", "3").count();
        System.out.println(count);


    }

}
