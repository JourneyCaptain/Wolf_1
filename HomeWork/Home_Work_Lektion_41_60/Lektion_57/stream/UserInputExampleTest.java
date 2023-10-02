package Lektion_57.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInputExampleTest {

    @Test
    public void testWriteUserNameToFile() throws IOException {

        UserInputExample example = new UserInputExample();
        String testUserName = "John Doe";

        example.writeUserNameToFile(testUserName);

        String actualUserName = Files.readString(Paths.get(UserInputExample.FILE_PATH));
        assertEquals(testUserName, actualUserName);
    }
}