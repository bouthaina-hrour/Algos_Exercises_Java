package binarySearch.sqrtOfX;

import org.example.binarySearch.sqrtOfX.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtOfXTest {
    @Test
    public void testMySqrtWithPerfectSquare() {
        Solution solution = new Solution();
        assertEquals(2, solution.mySqrt(4));
        assertEquals(3, solution.mySqrt(9));
        assertEquals(4, solution.mySqrt(16));
    }

    @Test
    public void testMySqrtWithNonPerfectSquare() {
        Solution solution = new Solution();
        assertEquals(2, solution.mySqrt(8));
        assertEquals(3, solution.mySqrt(14));
        assertEquals(5, solution.mySqrt(27));
    }

    @Test
    public void testMySqrtWithZero() {
        Solution solution = new Solution();
        assertEquals(0, solution.mySqrt(0));
    }

    @Test
    public void testMySqrtWithOne() {
        Solution solution = new Solution();
        assertEquals(1, solution.mySqrt(1));
    }

    @Test
    public void testMySqrtWithLargeNumber() {
        Solution solution = new Solution();
        assertEquals(46340, solution.mySqrt(2147483647));
    }
}
