package binarySearch.findMinimum;

import org.junit.jupiter.api.Test;

import static org.example.binarySearch.findMinimum.Solution.findMinInRotatedSortedArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumTest {

    @Test
    public void findMinInRotatedSortedArrayTest(){

        int[] nums = new int[]{30, 40, 50, 10, 20};
        assertEquals(3,findMinInRotatedSortedArray(nums));

        int[] otherNums= new int[]{3, 5, 7, 11, 13, 17, 19, 2};
        assertEquals(7,findMinInRotatedSortedArray(otherNums));

    }
}
