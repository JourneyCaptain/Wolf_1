package Lektion_57.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
class FileExampleTest {

    @Test
    public void testFileOperations() throws IOException {

        FileExample fileExample = new FileExample();
        fileExample.createFile();


        fileExample.readFromFile();
        fileExample.writeToTheEndOfFile("Hello, World!");

        String expectedContent = "Java is fun\nI love programming\nHello, World!\n";
        String actualContent = new String(Files.readAllBytes(Paths.get(FileExample.FILE_PATH)));
        assertEquals(expectedContent, actualContent);
    }
}