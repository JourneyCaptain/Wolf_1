package Lektion_57.stream;

import java.io.*;


public class FileExample {
    //  Задание 2: Работа с файлами
    //  Создайте текстовый файл с несколькими строками текста.
    //  Напишите метод, который будет читать этот файл и выводить содержимое в консоль.
    //  Напишите метод, который будет записывать в этот же файл строку “Hello, World!” в конец файла.
    //  Пример работы:
    //  Входные данные: Файл с текстом "Java is fun\nI love programming\n"
    //  Выходные данные: В консоль выводится:
    //  Java is fun
    //  I love programming
    //  Hello, World!

    public static final String FILE_PATH = "example.txt";

    public void createFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write("Java is fun\nI love programming\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToTheEndOfFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(content + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

