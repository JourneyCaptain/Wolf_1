package Home_Work_12;

public class Max_Element_In_Array {
    public static void main(String[] args) {

//        Задача 2
//        Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//        Найдите максимальный элемент массива и его индекс.

        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int maxElement = numbers[0];  // The first element of the array is taken as the maximal
        int maxIndex = 0;  //Index of the maximal element


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                maxIndex = i;
            }
        }


        System.out.println("Maximum element: " + maxElement);
        System.out.println("Index of the maximal element: " + maxIndex);
    }
}
