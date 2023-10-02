package Lektion_57.stream;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionHandlingExampleTest {

    @Test
    public void testReadFileExceptionHandling() {

        assertThrows(FileNotFoundException.class, () -> readFile("nonexistent.txt"));
    }

    private static void readFile(String filePath) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}