package Lektion_30.duplicates_In_Array;

public class DuplicateArray {
    public static void main(String[] args) {

    }


    // Задача 2. Поиск дубликатов в массиве.
    // Задумайте массив из 100 элементов и заполните его случайными
    // значениями целых чисел в интервале от 1 до 10.
    // Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.

    // Алгоритм:
    // Вар. 1 switch case по числам от 1 до 10. В каждом кейсе смотрим, сколько раз жоанное число попало в массив.
    // Вар. 2 внешний цикл запустить по числам от 1 до 10 и для каждого числа внутренним циклом посчитать, сколько раз
    // оно встретилось в массиве.
    // Вар 3. Объявить 10 счетчиков и для каждого из них в цикле понять, сколько раз число встерчалось в массиве.
    // Вар 4. Заполнить 2-х мерный массив x[][] - это на будущее.



    public int displayArr(int[] arr) {
        int count = 0;
        int a = 100; // размер элементов.
        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = (int) (Math.random() * 10) + 1;//генерирует случайное число в диапазоне от 1 до 10.
            count++;
        }
        return count;
    }

    public void displayNumbers(int[] myArray) {

        System.out.println("Numbers:");// Выводим массив на экран
        for (int arr : myArray) {
            System.out.print(arr + " | ");

        }

    }

    public int displayDuplicates(int[] myArray, int num) {
        int count = 0;
        System.out.println("Item " + myArray[num] + " find " + count + " times.");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                count++;
            }
        }
        return count;
    }
}

