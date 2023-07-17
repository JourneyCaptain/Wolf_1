package Home_Work_16.array.controller;

import Home_Work_16. array.model.Array;

public class Array_Appl {
    public static void main(String[] args) {

        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        Array array = new Array (numbers);

        System.out.println("Array elements:");//displays each element of the array on the screen.
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double average = array.evenIndexedElements();
        System.out.println("The average of the array elements with even indices: " + average );
    }
}
