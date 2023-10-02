package Lektion_57.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinedOperationsExampleTest {
    @Test
    public void testWriteToFile() throws IOException {

        CombinedOperationsExample example = new CombinedOperationsExample();
        List<String> inputStrings = List.of("apple", "banana", "cherry", "date");

        example.performOperationsAndWriteToFile(inputStrings);

        List<String> expectedLines = List.of("APPLE", "BANANA", "CHERRY", "DATE");
        List<String> actualLines = Files.readAllLines(Paths.get(CombinedOperationsExample.FILE_PATH));
        assertEquals(expectedLines, actualLines);
    }
}