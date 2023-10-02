package Lektion_44.code.binary_search;

public class BinarySearch {// Define a class named BinarySearch with a static method

    public static int binarySearch(int[] arr, int target) {// Define a static method for performing binary search on an array
        int left = 0;// Initialize the left pointer to the beginning of the array

        int right = arr.length - 1;// Initialize the right pointer to the end of the array


        while (left <= right) {// Start a loop to perform binary search

            int mid = left + (right - left) / 2; // Calculate the middle index using the left and right pointers


            if (arr[mid] == target) { // Check if the middle element is equal to the target

                return mid; // Return the index of the middle element if it matches the target

            } else if (arr[mid] < target) { // If the middle element is less than the target, update the left pointer
                left = mid + 1;
            } else {
                right = mid - 1;// If the middle element is greater than the target, update the right pointer
            }
        }

        return -1; // Return -1 if the target element is not found in the array
    }
}