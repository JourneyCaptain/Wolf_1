package Home_Work_32.car_mileage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class Car_MileageTest {
    Car_Mileage[] cars; // Array to hold the Car_Mileage objects.

    @BeforeEach
    void setUp() {
        cars = new Car_Mileage[]{
                new Car_Mileage("Mercedes", "Atlant", 2.9, 25000), // Creating Car_Mileage objects and initializing the array.
                new Car_Mileage("VW", "BVG", 2.0, 840000),
                new Car_Mileage("Audi", "BSR", 3.0, 6100),
                new Car_Mileage("Opel", "TiR", 1.8, 58)
        };
    }

    @Test
    void setMileage() {
        System.out.println("=========== Cars unsorted ===========");
        printArray(cars); // Printing the unsorted cars array.

        // Creating a comparator to sort the cars based on their mileage in reverse order using anonymous inner class.
        Comparator<Car_Mileage> carComparator = new Comparator<Car_Mileage>() {
            @Override
            public int compare(Car_Mileage o1, Car_Mileage o2) {
                return Double.compare(o2.getMileage(), o1.getMileage()); // Comparing cars based on their mileage in reverse.
            }
        };

        Arrays.sort(cars, carComparator); // Sorting the cars array using the comparator.
        System.out.println();
        System.out.println("=========== Cars sorted by mileage in reverse ===========");//(highest mileage car on top)
        printArray(cars); // Printing the sorted cars array.
    }

    // Method to print the contents of an array.
    public void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}