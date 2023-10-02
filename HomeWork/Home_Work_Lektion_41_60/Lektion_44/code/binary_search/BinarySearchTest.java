package Lektion_44.code.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Define a class for testing the BinarySearch class
public class BinarySearchTest {


    private int[] sortedArray;// Declare a private array to hold the sorted integers for testing

    // Before each test, set up the sortedArray with values
    @BeforeEach
    public void setUp() {
        sortedArray = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    }

    // Test case for searching an existing element in the sortedArray
    @Test
    public void testBinarySearchExistingElement() {
        // Call the binarySearch method to find the index of 8 in the sortedArray
        int index = BinarySearch.binarySearch(sortedArray, 8);
        // Compare the obtained index (3) with the expected index (3)
        assertEquals(3, index);
    }

    // Another test case for searching an existing element in the sortedArray
    @Test
    public void testBinarySearchExistingElement2() {
        // Call the binarySearch method to find the index of 14 in the sortedArray
        int index = BinarySearch.binarySearch(sortedArray, 14);
        // Compare the obtained index (6) with the expected index (6)
        assertEquals(6, index);
    }

    // Test case for searching a non-existing element in the sortedArray
    @Test
    public void testBinarySearchNonExistingElement() {
        // Call the binarySearch method to find the index of 5 in the sortedArray
        int index = BinarySearch.binarySearch(sortedArray, 5);
        // Compare the obtained index (-1) with the expected index (-1)
        assertEquals(-1, index);
    }

    // Test case for searching an element greater than any in the sortedArray
    @Test
    public void testBinarySearchGreaterElement() {
        // Call the binarySearch method to find the index of 21 in the sortedArray
        int index = BinarySearch.binarySearch(sortedArray, 21);
        // Compare the obtained index (-1) with the expected index (-1)
        assertEquals(-1, index);

        // Call the binarySearch method to find the index of 20 in the sortedArray
        int index1 = BinarySearch.binarySearch(sortedArray, 20);
        // Compare the obtained index (9) with the expected index (9) Сравнить полученный показатель с ожидаемым показателем
        assertEquals(9, index1);
    }

    // Test case for searching an element smaller than any in the sortedArray
    @Test
    public void testBinarySearchSmallerElement() {
        // Call the binarySearch method to find the index of 1 in the sortedArray
        int index = BinarySearch.binarySearch(sortedArray, 1);
        // Compare the obtained index (-1) with the expected index (-1)
        assertEquals(-1, index);

        // Call the binarySearch method to find the index of 2 in the sortedArray
        int index1 = BinarySearch.binarySearch(sortedArray, 2);
        // Compare the obtained index (0) with the expected index (0)
        assertEquals(0, index1);
    }
}


