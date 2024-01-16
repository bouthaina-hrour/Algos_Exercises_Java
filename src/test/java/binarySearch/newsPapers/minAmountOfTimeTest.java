package binarySearch.newsPapers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.binarySearch.newsPapers.Solution.minAmountOfTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class minAmountOfTimeTest {

    @Test
    public void minAmountOfTimeToReadNewspapersTest(){
        ArrayList<Integer> newspapersReadTimes = new ArrayList<>();
        newspapersReadTimes.add(2);
        newspapersReadTimes.add(3);
        newspapersReadTimes.add(5);
        newspapersReadTimes.add(7);
        assertEquals(7,minAmountOfTime(newspapersReadTimes,3));

        ArrayList<Integer> newspapersReadTimes2 = new ArrayList<>();
        newspapersReadTimes2.add(7);
        newspapersReadTimes2.add(2);
        newspapersReadTimes2.add(5);
        newspapersReadTimes2.add(10);
        newspapersReadTimes2.add(8);
        assertEquals(18,minAmountOfTime(newspapersReadTimes2,2));


    }
}
