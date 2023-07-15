package Home_Work_13.part_2;

import java.util.Random;

public class Sum_Of_Odd_Elements {
    public static void main(String[] args) {

        // Задача 1. Написать метод, принимающий массив целых чисел,
        // и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
        // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.

        int[] array = generateRandomArray(100);
        int sum = getSumOfOddElements(array);
        System.out.println(" The sum of odd elements of an array: " + sum);
        printArray(array);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    public static int getSumOfOddElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(arr[i] + " ");
        }


    }
}

