package org.example.mathAndGeometry.dividingSequence;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given an integer N Your task is to find the longest sequence of integers
 * a1<a2<.....<ak, such that ai divides a(i+1) and 1<=ai<=N for all i.
 */
public class Solution {
    // the largest sequence would be the sequence of powers of 2
    public static Result lengthOfLongestDividingSequence(int N) {
        int length = 0;
        int currentNumber = 1;
        List<Integer> sequence = new ArrayList<>();

        while (currentNumber <= N) {
            sequence.add(currentNumber);
            length++;
            currentNumber *= 2;
        }

        return new Result(length, sequence);
    }

}

