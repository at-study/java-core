package tests.lesson14.stream_api_terminal;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ToArrayStream {

    @Test
    public void toArray() {
        Object[] strings = Stream.of("строка1", "строка2", "строка3")
                .toArray();

    }
}
