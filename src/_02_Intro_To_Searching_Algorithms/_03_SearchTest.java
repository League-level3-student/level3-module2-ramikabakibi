package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	String[]array= {"hi", "yo", "whats sup", "hola"};
	int[]array1= {1, 3, 5, 6, 7, 9, 11, 15};
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    
        assertEquals(1, _01_LinearSearch.linearSearch(array, "yo"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(4, _02_BinarySearch.binarySearch(array1, 0, array1.length-1, 7));
        //FOR SOME REASON THIS ONE IS RETURNING -1, WHICH IN THE METHOD MEANS THAT THE VALUE WAS NOT FOUND
        //GO OVER THE METHOD BINARY SEARCH AND SEE IF IT MAKES SENSE, AND THEN CHECK AGAIN
    }
}
