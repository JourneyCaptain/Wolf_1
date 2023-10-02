package Lektion_30.duplicates_In_Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateArrayTest {
    DuplicateArray duplicateArray;


    @BeforeEach
    void setUp(){
        duplicateArray = new  DuplicateArray();

    }

    @Test
    void displayDuplicatesTest() {
        int[] arr = {5,4,5,3,2};
        //int res =duplicateArray.displayDuplicates(arr,5);
        //assertEquals(2,res);
        assertEquals(2,duplicateArray.displayDuplicates(arr,5));

    }
}