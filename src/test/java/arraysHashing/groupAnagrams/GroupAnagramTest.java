package arraysHashing.groupAnagrams;

import org.example.arraysHashing.groupAnagrams.Solution;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


import static arraysHashing.helper.assertEqualListsIgnoreOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramTest {
    @Test
    public void testGroupAnagramsWithShortAnagrams() {
        Solution solution = new Solution();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat"),
                Arrays.asList("eat", "tea", "ate")
        );
        assertEqualListsIgnoreOrder(expected, solution.groupAnagrams(input));
    }

    @Test
    public void testGroupAnagramsWithLongAnagrams() {
        Solution solution = new Solution();
        String[] input = {"abc", "def", "bca", "fed", "cab"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("abc", "bca", "cab"),
                Arrays.asList("def", "fed")
        );
        assertEqualListsIgnoreOrder(expected, solution.groupAnagrams(input));
    }

    @Test
    public void testGroupAnagramsWithEmptyArray() {
        Solution solution = new Solution();
        String[] input = {};
        List<List<String>> expected = Arrays.asList();
        assertEquals(expected, solution.groupAnagrams(input));
    }

    @Test
    public void testGroupAnagramsWithSingleWord() {
        Solution solution = new Solution();
        String[] input = {"hello"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("hello")
        );
        assertEqualListsIgnoreOrder(expected, solution.groupAnagrams(input));
    }

    @Test
    public void testGroupAnagramsWithDifferentLengths() {
        Solution solution = new Solution();
        String[] input = {"abc", "de", "bca", "fed", "cab"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("abc", "bca", "cab"),
                Arrays.asList("de"),
                Arrays.asList("fed")
        );
        assertEqualListsIgnoreOrder(expected, solution.groupAnagrams(input));
    }


}