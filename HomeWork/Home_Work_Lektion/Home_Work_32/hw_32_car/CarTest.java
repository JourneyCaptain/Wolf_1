package Home_Work_32.hw_32_car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {
    Car[] cars; // Array to hold the Car objects.

    @BeforeEach
    void setUp() {
        cars = new Car[]{
                new Car("Mercedes", "Atlant", 2.9), // Creating Car objects and initializing the array.
                new Car("Audi", "BSR", 3.0),
                new Car("VW", "BVG", 2.0),
                new Car("Opel", "TiR", 1.8)
        };
    }

    @Test
    void carSortByModel() {
        System.out.println("=========== Cars unsorted===========");
        printArray(cars); // Printing the unsorted cars array.

        // Creating a comparator to sort the cars based on their model using anonymous inner class.
        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel()); // Comparing cars based on their model names.
            }
        };

        Arrays.sort(cars, carComparator); // Sorting the cars array using the comparator.
        System.out.println();
        System.out.println("=========== Cars sorted by model ===========");

        printArray(cars); // Printing the sorted cars array.
    }

    // Method to print the contents of an array.
    public void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}