package Lektion_57.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {

    // Задание 5: Обработка исключений
    // Напишите метод, который будет пытаться читать несуществующий файл и обрабатывать возможное исключение FileNotFoundException,
    // выводя сообщение об ошибке в консоль.
    // Пример работы:
    // Входные данные: Попытка чтения несуществующего файла nonexistent.txt.
    // Выходные данные: В консоль выводится сообщение "File not found: nonexistent.txt".
    private static void readFile(String filePath) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}