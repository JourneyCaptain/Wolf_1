package Home_Work_34.practice.bubble_sort;

import java.util.Comparator;
public class Bubble_Sort {

    // Bubble sort method for generic types
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Outer loop for the pass
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons within the pass
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1] if the elements are not in the correct order
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print the elements of an array
    public static <T> void printArray(T[] arr) {
        for (T element : arr) { // Loop through each element in the array
            System.out.println(element); // Print the element
        }
    }
}