package graphs.weakVertices;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.graphs.weakVertices.Solution.findWeakVertices;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class weakVerticesTest {
    @Test
    void testFindWeakVertices() {

        int[][] adjacencyMatrix = {
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };

        List<Integer> weakVertices = findWeakVertices(adjacencyMatrix);

        // Weak vertices in this example are {0, 1, 2, 3}
        List<Integer> expectedWeakVertices = Arrays.asList(0, 1, 2, 3);

        assertEquals(expectedWeakVertices, weakVertices);
    }
}
