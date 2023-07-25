package Home_Work_28.duplicat_in_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class Duplicate_ArrayTest {
        Duplicate_Array array;
        @BeforeEach
        void setUp() {
            array = new Duplicate_Array();}
        @Test
        void displayArr() {
            int [] arr =  new int[100];;
            assertEquals(100,array.displayArr(arr));
        }
        @Test
        void displayNumbers() {
            int [] arr = {5,5,5, 2,3,4,4, 1,1,1} ;
            assertEquals(10,array.displayNumbers(arr));
        }
        @Test
        void displayDuplicates() {
            int [] arr = {5,5,5, 2,3,4,4, 1,1,1};
            assertEquals(5,array.displayDuplicates(arr));
        }
    }

