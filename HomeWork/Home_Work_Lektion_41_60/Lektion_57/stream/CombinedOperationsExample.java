package Lektion_57.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedOperationsExample {

    // Задание 4: Комбинированные операции
    // Создайте коллекцию строк.
    // Используя Stream API, преобразуйте каждую строку в верхний регистр, и отфильтруйте строки, длина которых больше 3 символов.
    // Запишите отфильтрованные и преобразованные строки в новый текстовый файл.
    // Пример работы:
    // Входные данные: Список строк ["apple", "banana", "cherry", "date"].
    // Выходные данные: В файл записываются строки:
    // APPLE
    // BANANA
    // CHERRY
    // DATE
    public static final String FILE_PATH = "output.txt";

    public void performOperationsAndWriteToFile(List<String> strings) {

        List<String> filteredAndTransformed = strings.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());


        writeToFile(filteredAndTransformed);
    }

    private void writeToFile(List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

