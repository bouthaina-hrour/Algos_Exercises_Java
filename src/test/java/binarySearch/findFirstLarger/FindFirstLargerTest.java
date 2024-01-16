package binarySearch.findFirstLarger;

import org.junit.jupiter.api.Test;

import static org.example.binarySearch.findFirstLarger.Solution.findFirstLargerThanTarget;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstLargerTest {

    @Test
    public void testFindFirstLargerThanTargetInSortedArrayWithDifferentValues() {
        int[] nums= new int[]{1, 3, 3, 5, 8, 8, 10};
        assertEquals(1,findFirstLargerThanTarget(nums,2));

        int[] otherNums= new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        assertEquals(3,findFirstLargerThanTarget(otherNums,6));


    }
}
