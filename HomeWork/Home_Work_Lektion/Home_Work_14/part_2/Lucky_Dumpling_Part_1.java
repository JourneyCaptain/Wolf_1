package Home_Work_14.part_2;

import java.util.Random;

public class Lucky_Dumpling_Part_1 {
    public static void main(String[] args) {

//        Задача 2. (повторение и закрепление темы массивы,
//        заполнение массива с помощью датчика случайных чисел)
//
//        Задача про поиск "счастливого пельменя",
//        часть 1.
//        Хозяйка налепила для гостей 30 пельменей,
//        каждый весом от 25 до 35 грамм.
//        Напишите программу, которая занесет в массив
//        данные о весе каждого слепленного пельменя.


        int numberOfDumpling = 30;
        int minWeight = 25;
        int maxWeight = 35;

        int[] weight = new int[numberOfDumpling];

        Random random = new Random();
        for (int i = 0; i < numberOfDumpling; i++) {
            weight[i] = random.nextInt(maxWeight - minWeight + 1) + minWeight;
        }

        System.out.println("Weights of Dumpling:");
        for (int i = 0; i < numberOfDumpling; i++) {
            System.out.println("Dumpling " + (i + 1) + ": " + weight[i] + " grams");
        }
    }
}




























