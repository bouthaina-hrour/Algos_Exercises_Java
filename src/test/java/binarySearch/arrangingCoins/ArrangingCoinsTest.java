package binarySearch.arrangingCoins;

import org.example.binarySearch.arrangingCoins.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangingCoinsTest {
    @Test
    public void testArrangeCoinsWithValidInput() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoins(5));
        assertEquals(3, solution.arrangeCoins(8));
        assertEquals(4, solution.arrangeCoins(10));
    }

    @Test
    public void testArrangeCoinsWithZeroCoins() {
        Solution solution = new Solution();
        assertEquals(0, solution.arrangeCoins(0));
    }

    @Test
    public void testArrangeCoinsWithLargeNumberOfCoins() {
        Solution solution = new Solution();
        assertEquals(60070, solution.arrangeCoins(1804289383));
    }

    @Test
    public void testArrangeCoinsWithSingleCoin() {
        Solution solution = new Solution();
        assertEquals(1, solution.arrangeCoins(1));
    }

    @Test
    public void testArrangeCoinsWithSmallNumberOfCoins() {
        Solution solution = new Solution();
        assertEquals(1, solution.arrangeCoins(2));
    }
}
