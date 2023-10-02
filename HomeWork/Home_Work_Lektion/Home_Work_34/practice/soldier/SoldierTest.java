package Home_Work_34.practice.soldier;

// Import JUnit annotations for testing

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

// Define the SoldierTest class
class SoldierTest {
    // Declare an array of Soldier objects
    Soldier[] soldiers;

    // This method is executed before each test method
    @BeforeEach
    void setUp() {
        // Initialize the soldiers array with Soldier objects
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 81),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 172, 69.3, 92),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Anna", 162, 55.0, 88)
        };
    }

    // Test method to sort soldiers by weight
    @Test
    void soldiersSortByWeight() {
        // Print the unsorted soldiers array
        System.out.println("=========== Soldiers unsorted===========");
        printArray(soldiers);
        System.out.println();

        // Create a custom comparator to sort soldiers by weight
        Comparator<Soldier> soldierComparator = new Comparator <Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                // Compare the weights of two soldiers
                if (s1.getWeight() == s2.getWeight()) {
                    return 0;
                } else if (s1.getWeight() > s2.getWeight()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Sort the soldiers array using the custom comparator
        Arrays.sort(soldiers, soldierComparator);

        // Print the sorted soldiers array
        System.out.println();
        System.out.println("=========== Soldiers sorted by weight ===========");
        printArray(soldiers);
    }

    // Test method to sort soldiers by height and then by weight
    @Test
    void soldiersSortByHeightAndWeight() {
        // Print the unsorted soldiers array
        System.out.println("=========== Soldiers unsorted ===========");
        printArray(soldiers);

        // Create a custom comparator to sort soldiers by height and then by weight
        Comparator<Soldier> soldierComparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                // Compare the heights of two soldiers
                int heightComparison = Integer.compare(s1.getHeight(), s2.getHeight());
                if (heightComparison != 0) {
                    return heightComparison;
                }
                // If the heights are equal, compare the weights of two soldiers
                return Double.compare(s1.getWeight(), s2.getWeight());
            }
        };

        // Sort the soldiers array using the custom comparator
        Arrays.sort(soldiers, soldierComparator);

        // Print the sorted soldiers array
        System.out.println();
        System.out.println("=========== Soldiers sorted by height and weight ===========");
        printArray(soldiers);
    }

    // Utility method to print the elements of an array
    public void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}