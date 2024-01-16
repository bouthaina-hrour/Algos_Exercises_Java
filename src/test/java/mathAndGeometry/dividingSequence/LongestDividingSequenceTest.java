package mathAndGeometry.dividingSequence;

import org.example.mathAndGeometry.dividingSequence.Result;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.mathAndGeometry.dividingSequence.Solution.lengthOfLongestDividingSequence;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestDividingSequenceTest {

    @Test
    public void longestDividingSequenceTest() {
        List<Integer> expectedSequence = new ArrayList<>();
        expectedSequence.add(1);
        expectedSequence.add(2);
        expectedSequence.add(4);
        Result expected = new Result(3, expectedSequence);
        assertEquals(expected.length, lengthOfLongestDividingSequence(6).length);
        assertEquals(expected.sequence, lengthOfLongestDividingSequence(6).sequence);
    }
}
