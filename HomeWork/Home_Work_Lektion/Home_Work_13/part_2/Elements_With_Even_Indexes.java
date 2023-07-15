package Home_Work_13.part_2;

public class Elements_With_Even_Indexes {
    public static void main(String[] args) {

        // Задача 2. Написать метод, принимающий массив целых чисел, и возвращающий
        // произведение всех его элементов, с четными индексами. 0 - тоже четное число.

        int[] array = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int product = evenIndexedElements(array);
        System.out.println("The product of elements with even indexes: " + product);
        printArray(array);
    }

    public static int evenIndexedElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i = i + 2) {
            product = product * array[i];
            System.out.println("Number of index: " + i +" Number of array: " + (array[i]));
        }
        return product;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " | ");
        }
    }
}