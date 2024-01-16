package org.example.binarySearch.newsPapers;


import java.util.Collections;
import java.util.List;

/**
 * EXO 7 - Newspapers
 * You've begun your new job to organize newspapers. Each morning, you are to separate the newspapers into smaller piles and assign each pile to a co-worker. This way, your co-workers can read through the newspapers and examine its contents simultaneously.
 * Each newspaper is marked with a read time to finish all its contents. A worker can read one newspaper at a time, and when they finish a newspaper, they can start reading the next newspaper. Your goal is to minimize the amount of time needed for your co-workers to finish all newspapers. Additionally, the newspapers came in a particular order, and you must not disarrange the original ordering when distributing the newspapers. In other words, you cannot pick and choose newspapers randomly from the whole pile to assign to a co-worker, but rather you must take a subsection of consecutive newspapers from the whole pile.
 * What is the minimum amount of time it would take to have your coworkers go through all the newspapers? That is, if you optimize the distribution of newspapers, what is the longest read time among all piles?
 * Constraints
 * 1 <= newspapers_read_times.length <= 10^5
 * 1 <= newspapers_read_times[i] <= 10^5
 * 1 <= num_coworkers <= 10^5
 * Examples
 * Example 1:
 * Input: newspapers_read_times = [7,2,5,10,8], num_coworkers = 2
 * Output: 18
 * Explanation:
 * Assign first 3 newspapers to one coworker then assign the rest to another. The time it takes for the first 3 newspapers is 7 + 2 + 5 = 14 and for the last 2 is 10 + 8 = 18.
 * Example 2:
 * Input: newspapers_read_times = [2,3,5,7], num_coworkers = 3
 * Output: 7
 * Explanation:
 * Assign [2, 3], [5], and [7] separately to workers. The minimum time is 7.
 */
public class Solution {
    /*
    - the smallest amount of time will be the max of reading times of all newspapers
    - the largest amount of time will be the sum of all reading times( in case that one cowoker reads all newspapers
    - the minimum time we are searching will be between the two of them
     */
    public static int minAmountOfTime(List<Integer> newspapersReadTimes, int numOfCoworkers) {

        int left = Collections.max(newspapersReadTimes);
        int right = 0;
        for (int time : newspapersReadTimes) {
            right += time;
        }
        int minTimeResult = left;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (timeIsEnough(newspapersReadTimes, numOfCoworkers, mid)) {
                minTimeResult = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return minTimeResult;


    }

    private static boolean timeIsEnough(List<Integer> newspapersReadTimes, int numOfCoworkers, int availableTime) {
        int numOfCoworkersNeeded = 1;
        int cumulatedTime=0;
        for(int time: newspapersReadTimes ){
            if(time+cumulatedTime>availableTime){
                numOfCoworkersNeeded++;
                cumulatedTime=0;
            }
            cumulatedTime+=time;
        }

        return numOfCoworkersNeeded<=numOfCoworkers;
    }


}
