package org.example.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyBigInteger {

    private final List<Integer> digitis;
    private final boolean isNegative;

    public MyBigInteger(int value) {
        digitis = new ArrayList<>();
        isNegative = value < 0;

        value = Math.abs(value);
        while (value > 0) {
            digitis.add(value % 10);
            value = value / 10;
        }
        if (digitis.isEmpty()) digitis.add(0);
    }

    public MyBigInteger(List<Integer> digits, boolean isNegative) {
        this.digitis = digits;
        this.isNegative = isNegative;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append(digitis.stream().map(a -> a.toString()).collect(Collectors.joining())).reverse();

        return isNegative ? "-" + result : result.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        MyBigInteger other = (MyBigInteger) object;
        return other.isNegative==this.isNegative && other.digitis.equals(this.digitis);

    }
    @Override
    public int hashCode(){
        return Objects.hash(digitis,isNegative);
    }

    /**
     * Addition method must do all these cases
     * Positive + positive : do regular addition
     * negative + negative : regular addition and set isNegative of the result to true
     * positive + negative or negative +positive: compare magnitudes and substract the smaller from the larger one, the sign is the sign of larger one
     */

    public MyBigInteger add(MyBigInteger otherValue) {
        if (this.isNegative == otherValue.isNegative) {
            return performAddition(this, otherValue);
        } else {
            return performSubstraction(otherValue, this);
        }
    }

    /**
     * Subtraction method must do all these cases
     * negative - negative : perform substraction
     * other case perform addition
     */
    public MyBigInteger substract(MyBigInteger otherValue) {
        if (this.isNegative == otherValue.isNegative) {
            return performSubstraction(this, otherValue);
        } else {
            return performAddition(this, otherValue);
        }

    }

    private MyBigInteger performAddition(MyBigInteger firstValue, MyBigInteger secondValue) {
        List<Integer> resultDigits = new ArrayList<>();
        boolean resultIsNegative = firstValue.isNegative;

        int carry = 0;

        int sizeOfResult = Math.max(firstValue.digitis.size(), secondValue.digitis.size());

        for (int i = 0; i < sizeOfResult; i++) {
            int sum = carry;
            if (i < firstValue.digitis.size()) {
                sum += firstValue.digitis.get(i);
            }
            if (i < secondValue.digitis.size()) {
                sum += secondValue.digitis.get(i);
            }
            resultDigits.add(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) resultDigits.add(carry);
        return new MyBigInteger(resultDigits, resultIsNegative);

    }

    private MyBigInteger performSubstraction(MyBigInteger first, MyBigInteger second) {
        if (first.compareMagnitudesTo(second) >= 0) {
            List<Integer> resultDigits = new ArrayList<>();
            boolean resultIsNegative = first.isNegative;
            int borrow = 0;


            int resultSize = Math.max(first.digitis.size(), second.digitis.size());
            for (int i = 0; i < resultSize; i++) {
                int diff = borrow;
                if (i < first.digitis.size()) {
                    diff += first.digitis.get(i);
                }
                if (i < second.digitis.size()) {
                    diff -= second.digitis.get(i);
                }
                if (diff < 0) {
                    diff += 10;
                    borrow = -1;
                } else borrow = 0;
                if (diff != 0) resultDigits.add(diff);
            }

            return new MyBigInteger(resultDigits, resultIsNegative);
        } else {
            MyBigInteger result = performSubstraction(second, first);
            return new MyBigInteger(result.digitis, !result.isNegative);
        }
    }

    private int compareMagnitudesTo(MyBigInteger value) {
        if (this.digitis.size() > value.digitis.size()) return 1;
        if (this.digitis.size() < value.digitis.size()) return -1;

        for (int i = this.digitis.size() - 1; i >= 0; i--) {
            if (digitis.get(i) > value.digitis.get(i)) return 1;
            if (digitis.get(i) < value.digitis.get(i)) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // positive et negative
        MyBigInteger exemple1 = new MyBigInteger(3);
        MyBigInteger exemple2 = new MyBigInteger(-5);

        System.out.println(exemple1.substract(exemple2));
        System.out.println(exemple1.add(exemple2));

        // positive et positive
        MyBigInteger exemple3 = new MyBigInteger(3);
        MyBigInteger exemple4 = new MyBigInteger(5);

        System.out.println(exemple3.substract(exemple4));
        System.out.println(exemple3.add(exemple4));

        //  negative  et negative
        MyBigInteger exemple5 = new MyBigInteger(-3);
        MyBigInteger exemple6 = new MyBigInteger(-5);

        System.out.println(exemple5.substract(exemple6));
        System.out.println(exemple5.add(exemple6));


        //  negative  et positive
        MyBigInteger exemple7 = new MyBigInteger(-3);
        MyBigInteger exemple8 = new MyBigInteger(5);

        System.out.println(exemple7.substract(exemple8));
        System.out.println(exemple7.add(exemple8));
    }


}
