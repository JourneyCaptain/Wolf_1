package Lektion_57.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

//  Задание 1: Работа с потоками данных
//  Создайте коллекцию типа List<Integer> с числами от 1 до 100.
//  Используя Stream API, отфильтруйте только четные числа, затем каждое число умножьте на 2 и соберите результат в новый список.
//  Выведите новый список в консоль.
//  Пример работы:
//  Входные данные: Числа от 1 до 100.
//  Выходные данные: [4, 8, 12, 16, 20, ..., 196, 200]


    public List<Integer> performStreamOperations(List<Integer> numbers) {
        List<Integer> generatedNumbers = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());


        List<Integer> result = generatedNumbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());

        return result;
    }
}

