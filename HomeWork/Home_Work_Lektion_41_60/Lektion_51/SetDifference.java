package Lektion_51;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {
    //## Задача 1.
    //Работа с set:
    //**Разность множеств**
    //Цель:
    //Создайте метод, который принимает два множества и возвращает новое множество.
    // Новое множество должно содержать элементы, которые есть в первом множестве, но отсутствуют во втором.
    //Примеры множеств:
    //Множество 1: **(A, B, C, D)**
    //Множество 2: **(C, D, E, F)**
    //Ожидаемый результат:
    //Результирующее множество: **(A, B)**
    //Подсказка:
    //Используйте методы ```addAll``` и ```removeAll``` или итератор и метод ```contains``` для выполнения этой задачи.

    public static Set<String> findSetDifference(Set<String> set1, Set<String> set2) {
        // Создаем новое множество, содержащее все элементы из set1
        Set<String> resultSet = new HashSet<>(set1);

        // Удаляем из resultSet все элементы, которые есть в set2
        resultSet.removeAll(set2);

        return resultSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("D");
        set2.add("E");
        set2.add("F");

        Set<String> resultSet = findSetDifference(set1, set2);

        System.out.println("Result set: " + resultSet);
    }
}

