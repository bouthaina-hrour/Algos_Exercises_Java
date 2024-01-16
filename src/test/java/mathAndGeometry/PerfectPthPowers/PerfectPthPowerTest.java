package mathAndGeometry.PerfectPthPowers;

import org.junit.jupiter.api.Test;


import static org.example.mathAndGeometry.perfectPthPowers.Solution.findLargestPower;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectPthPowerTest {

    @Test
    void perfectPthPowerTest(){
        assertEquals(1, findLargestPower(17));
        assertEquals(30, findLargestPower(1073741824));
        assertEquals(2, findLargestPower(25));
    }
}
