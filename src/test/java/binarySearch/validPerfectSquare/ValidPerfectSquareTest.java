package binarySearch.validPerfectSquare;

import org.example.binarySearch.validPerfectSquare.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPerfectSquareTest {
    @Test
    public void testIsPerfectSquareWithPerfectSquare() {
        Solution solution = new Solution();
        assertTrue(solution.isPerfectSquare(4));
        assertTrue(solution.isPerfectSquare(9));
        assertTrue(solution.isPerfectSquare(16));
    }

    @Test
    public void testIsPerfectSquareWithNonPerfectSquare() {
        Solution solution = new Solution();
        assertFalse(solution.isPerfectSquare(2));
        assertFalse(solution.isPerfectSquare(14));
        assertFalse(solution.isPerfectSquare(27));
    }

    @Test
    public void testIsPerfectSquareWithOne() {
        Solution solution = new Solution();
        assertTrue(solution.isPerfectSquare(1));
    }

    @Test
    public void testIsPerfectSquareWithLargeNumber() {
        Solution solution = new Solution();
        assertTrue(solution.isPerfectSquare(2147395600));
    }
}
