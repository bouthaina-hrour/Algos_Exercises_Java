package binarySearch.findElement;

import org.junit.jupiter.api.Test;

import static org.example.binarySearch.findElement.Solution.findElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindElementTest {


    @Test
    public void findFirstOccurenceInSortedArrayTest() {

        int[] nums= new int[]{1, 3, 3, 3, 3, 6, 10, 10, 10, 100};
        assertEquals(1,findElement(nums,3) );

        int[] otherNums= new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        assertEquals(-1,findElement(otherNums,6) );

    }
}

