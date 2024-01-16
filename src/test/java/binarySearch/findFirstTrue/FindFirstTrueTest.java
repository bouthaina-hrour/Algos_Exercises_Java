package binarySearch.findFirstTrue;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.example.binarySearch.findFirstTrue.Solution.findFirstTrueIndexInSortedArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstTrueTest {

    @Test
    public void testFindFirstTrueInSortedArray() {
        List<Boolean> arr = new ArrayList<>();
        arr.add(false);
        arr.add(false);
        arr.add(true);
        arr.add(true);
        arr.add(true);
        assertEquals(2,findFirstTrueIndexInSortedArray(arr));

    }
}
