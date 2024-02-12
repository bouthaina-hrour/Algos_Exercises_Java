package org.example.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drawdowns {


    public static double[] getMaximalDrawdown(double[] pnl) {
        double maximalDrawdown = 0;
        int i1 = 0;
        int i2 = 0;
        int current_i1 = 0;
        int current_i2 = 0;

        double currentDrawdawn = 0;


        for (int i = 1; i < pnl.length; i++) {

            if (pnl[i] < pnl[i - 1]) {
                currentDrawdawn += pnl[i - 1] - pnl[i];
                current_i2 = i;
            } else {
                // y a plus de drawdown lorsqu'on atteint un maximum local plus grand que le dernier max local,
                // on doit comparer les drawdown et update le max
                if (pnl[i] > pnl[current_i1]) {
                    if (currentDrawdawn > maximalDrawdown) {
                        maximalDrawdown = currentDrawdawn;
                        i1 = current_i1;
                        i2 = current_i2;

                    }
                    current_i1 = i;
                    current_i2 = i;
                    currentDrawdawn = 0;

                }
                // si c'est un max local moins que le max local precedent on rajoute le gain
                else if (i < pnl.length - 1 && pnl[i] > pnl[i - 1] && pnl[i] > pnl[i + 1])
                    currentDrawdawn -= pnl[i] - pnl[i - 1];
            }
        }
        //  I verify if the last calculated Drawdawn is maximal or not
        if (currentDrawdawn > maximalDrawdown) {
            maximalDrawdown = currentDrawdawn;
            i1 = current_i1;
            i2 = current_i2;
        }
        double[] result = new double[3];
        result[0] = i1;
        result[1] = i2;
        result[2] = -maximalDrawdown;
        return result;
    }

    public static List<double[]> getAllDrawdowns(double[] pnl) {

        List<double[]> resultsList = new ArrayList<>();
        int current_i1 = 0;
        int current_i2 = 0;

        double currentDrawdawn = 0;


        for (int i = 1; i < pnl.length; i++) {

            if (pnl[i] < pnl[i - 1]) {
                currentDrawdawn += pnl[i - 1] - pnl[i];
                current_i2 = i;
            } else {
                // y a plus de drawdown lorsqu'on atteint un maximum local plus grand que le dernier max local,
                // on doit comparer les drawdown et update le max
                if (pnl[i] > pnl[current_i1]) {
                    if(currentDrawdawn!=0){
                        double[] result = new double[3];
                        result[0] = current_i1;
                        result[1] = current_i2;
                        result[2] = -currentDrawdawn;
                        resultsList.add(result);
                    }

                    current_i1 = i;
                    current_i2 = i;
                    currentDrawdawn = 0;

                }
                // si c'est un max local moins que le max local precedent on rajoute le gain
                else if (i < pnl.length - 1 && pnl[i] > pnl[i - 1] && pnl[i] > pnl[i + 1])
                    currentDrawdawn -= pnl[i] - pnl[i - 1];
            }
        }
        //  I add the last calculated Drawdawn if it is not 0

        if(currentDrawdawn!=0){
            double[] result = new double[3];
            result[0] = current_i1;
            result[1] = current_i2;
            result[2] = -currentDrawdawn;
            resultsList.add(result);
        }


        return resultsList;

    }

    public static void main(String[] args) {
        //Arrays.stream(getMaximalDrawdown(new double[]{5, 10, 18, 17, 12, 20, 25, 18, 22, 17, 14, 19, 28, 22, 19})).forEach(a -> System.out.println(a));
        System.out.println("------------------------------");
        //Arrays.stream(getMaximalDrawdown(new double[]{5, 10, 18, 17, 12, 20, 25, 18, 22, 17, 14, 19, 100})).forEach(a -> System.out.println(a));
        System.out.println(getAllDrawdowns(new double[]{5, 10, 18, 17, 12, 20, 25, 18, 22, 17, 14, 19, 28, 22, 19}).stream().count());
        System.out.println(getAllDrawdowns(new double[]{5, 10, 18, 17, 12, 20, 25, 18, 22, 17, 14, 19, 100}).stream().count());
    }
}
