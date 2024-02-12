package org.example.arraysHashing.janitorEfficient;

import java.util.Collections;
import java.util.List;

public class JanitorEfficient {
    static final float MAX_WEIGHT_IN_TRIP = 3.0F;

    public static int efficientJanitor(List<Float> weight) {
        int result = 0;
        Collections.sort(weight);
        int l = 0;
        int r = weight.size() - 1;


        while (l <= r) {
            float cumulatedWeight = weight.get(r);
            while (l <= r && cumulatedWeight + weight.get(l) <= MAX_WEIGHT_IN_TRIP) {
                cumulatedWeight+=weight.get(l);
                l++;
            }
            result++;
            r--;
        }
        return result;

    }
}
