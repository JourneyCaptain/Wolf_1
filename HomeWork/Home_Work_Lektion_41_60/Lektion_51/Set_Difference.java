package Lektion_51;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Difference {
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
        Set<String> resultSet = new HashSet<>();

        // Создаем итератор для первого множества
        Iterator<String> iterator = set1.iterator();

        // Перебираем элементы первого множества
        while (iterator.hasNext()) {
            String element = iterator.next();

            // Проверяем, содержится ли элемент во втором множестве
            if (!set2.contains(element)) {
                // Если элемент отсутствует во втором множестве, добавляем его в результат
                resultSet.add(element);
            }
        }

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

