package Lektion_44.code.bubbleSort;

public class BubbleSortStringTraning {
    public static void main(String[] args) {

        // Initialize an array of strings
        String[] arr = new String[]{"elephant", "banana", "ocean", "night", "happiness",
                "guitar", "carrot", "kite", "forest", "tiger",
                "mountain", "dog", "ice cream", "jungle", "rainbow",
                "sunset", "apple", "pineapple", "lemon", "quilt"};

        // Print a blank line
        System.out.println();

        // Print the unsorted array
        System.out.print("Unsorted array: ");
        for (String value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println(); // Move to a new line

        // Bubble Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Compare adjacent elements and swap if necessary
                if (arr[j].compareTo(arr[j + 1]) > 0)  {
                    String t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        // Print a blank line
        System.out.println();

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (String value : arr) {
            System.out.print(value + ", ");
        }
    }
}