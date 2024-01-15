package arraysHashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class helper {
    public static  <T> void assertEqualListsIgnoreOrder(List<T> expected, List<T> actual) {
        Set<T> expectedSet = new HashSet<>(expected);
        Set<T> actualSet = new HashSet<>(actual);
        assertEquals(expectedSet, actualSet);
    }
}
