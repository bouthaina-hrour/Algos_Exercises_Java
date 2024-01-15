package dynamicProgramming.coinChange;

import org.example.dynamicProgramming.coinChange.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {
    @Test
    public void testCoinChangeWithValidAmount() {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        assertEquals(3, solution.coinChange(coins, 11));

        int[] coins2 = {2};
        assertEquals(-1, solution.coinChange(coins2, 3));
    }

    @Test
    public void testCoinChangeWithZeroAmount() {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        assertEquals(0, solution.coinChange(coins, 0));
    }

    @Test
    public void testCoinChangeWithInvalidAmount() {
        Solution solution = new Solution();
        int[] coins = {2};
        assertEquals(-1, solution.coinChange(coins, 1));
    }

    @Test
    public void testCoinChangeWithLargeAmount() {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        assertEquals(20, solution.coinChange(coins, 100));
    }
}
