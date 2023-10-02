package Lektion_44.code.bubbleSort;

public class BubbleSortIntTest {
    public static void main(String[] args) {
        int[] arr = {11, 6, 8, 32, 14, 7, 5, 2, 1, 0};

        // Print the unsorted array
        System.out.println("Unsorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // Move to a new line

        // Bubble Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}