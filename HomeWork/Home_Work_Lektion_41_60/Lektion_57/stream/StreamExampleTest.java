package Lektion_57.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamExampleTest {

    @Test
    public void testPerformStreamOperations() {

        StreamExample streamExample = new StreamExample();
        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> result = streamExample.performStreamOperations(inputNumbers);

        assertEquals(List.of(4, 8, 12, 16, 20), result.subList(0, 5));
    }
}