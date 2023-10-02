package Lektion_44.code.bubbleSort;
import java.util.Arrays;

public class AddSortArrayString {
    public static void main(String[] args) {
        String[] arraystring = {"mountain", "dog", "ice cream", "jungle", "rainbow",
                "sunset", "apple", "pineapple", "lemon", "quilt"};
        String str = "banana";

        // Print the unsorted array
        System.out.print("Unsorted array: ");
        for (String value : arraystring) {
            System.out.print(value + ", ");
        }

        // Sort the array using Arrays.sort
        Arrays.sort(arraystring);

        // Search for the index where the new element should be inserted
        int index = Arrays.binarySearch(arraystring, str);

        System.out.println("\n==============================================");
        System.out.println("Index of a non-existent item: " + index);

        // Process the index
        index = index > 0 ? index : -index - 1;


        // Create a new array with the new element added
        String[] arrayStringCopy = new String[arraystring.length + 1];
        System.arraycopy(arraystring, 0, arrayStringCopy, 0, index);
        arrayStringCopy[index] = str; // Add the new element
        System.arraycopy(arraystring, index, arrayStringCopy, index + 1, arraystring.length - index);

        System.out.println("==============================================");
        System.out.println("Array with a new element added: " + Arrays.toString(arrayStringCopy));
    }
}