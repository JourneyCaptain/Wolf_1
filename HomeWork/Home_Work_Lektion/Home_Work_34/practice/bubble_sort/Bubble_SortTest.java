package Home_Work_34.practice.bubble_sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Bubble_SortTest {
    Integer[] arrNum; // Declaration of Integer array variable for testing integers
    String[] arrStr; // Declaration of String array variable for testing strings
    Bubble_Sort bubbleSort; // Declaration of Bubble_Sort instance variable for the sorting algorithm

    @BeforeEach
    void setUp() {
        bubbleSort = new Bubble_Sort(); // Initialize the Bubble_Sort instance before each test
    }

    // Test for Integer
    @Test
    public void testBubbleSortForIntegers() {
        Integer[] arrNum = {9, 2, 5, 1, 7}; // Declaration and initialization of Integer array
        Integer[] sortedArr = {1, 2, 5, 7, 9}; // Expected sorted array for comparison

        bubbleSort.bubbleSort(arrNum, Integer::compareTo); // Call the bubbleSort method for Integer array
        assertArrayEquals(sortedArr, arrNum); // Assert that the sorted array is equal to the expected sorted array
        bubbleSort.printArray(arrNum); // Print the sorted Integer array
    }

    // Test for Strings
    @Test
    public void testBubbleSortForStrings() {
        String[] arrStr = {"apple", "orange", "banana", "grape", "kiwi"}; // Declaration and initialization of String array
        String[] sortedArr = {"apple", "banana", "grape", "kiwi", "orange"}; // Expected sorted array for comparison

        bubbleSort.bubbleSort(arrStr, String::compareTo); // Call the bubbleSort method for String array
        assertArrayEquals(sortedArr, arrStr); // Assert that the sorted array is equal to the expected sorted array
        bubbleSort.printArray(arrStr); // Print the sorted String array
    }
}