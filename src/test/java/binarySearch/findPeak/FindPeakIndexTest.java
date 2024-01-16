package binarySearch.findPeak;

import org.junit.jupiter.api.Test;

import static org.example.binarySearch.findPeak.Solution.findPeakIndex;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindPeakIndexTest {
    @Test
    public void findPeakIndexInMountainArrayTest() {
        int[] nums = new int[]{0, 1, 2, 3, 2, 1, 0};
        assertEquals(3, findPeakIndex(nums));

    }

    @Test
    public void findPeakIndexInMountainArrayWithOtherValuesTest() {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6};
        assertEquals(6, findPeakIndex(nums));

    }



}
