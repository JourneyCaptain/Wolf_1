package Lektion_57.stream;

import java.io.*;

public class UserInputExample {
    // Задание 3: Работа с пользовательским вводом
    // Напишите программу, которая будет запрашивать у пользователя его имя.
    // Запишите имя пользователя в текстовый файл.
    // Затем прочитайте файл и выведите приветствие пользователю в консоль.
    // Пример работы:
    // Входные данные: Имя пользователя Alice.
    // Выходные данные: В консоль выводится "Hello, Alice!".
    public static final String FILE_PATH = "username.txt";

    public String promptUserName(BufferedReader reader) {
        try {
            System.out.print("Enter your name: ");
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeUserNameToFile(String userName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(userName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readUserNameFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String userName = reader.readLine();
            if (userName != null) {
                System.out.println("Hello, " + userName + "!");
            } else {
                System.out.println("Failed to read the username from the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

