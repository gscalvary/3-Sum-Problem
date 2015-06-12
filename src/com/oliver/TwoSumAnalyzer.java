package com.oliver;

import java.util.Arrays;

// Given an array of integers determine if any two of them sum to a given total.
public class TwoSumAnalyzer {

    public boolean analyze(int[] array, int target) {

        if(array != null) {
            Arrays.sort(array);

            int i = 0;
            int j = array.length - 1;

            while (i <= j) {

                int sum = array[i] + array[j];

                if (sum == target) {
                    System.out.println("In TwoSumAnalyzer: " + array[i] + " + " + array[j] + " = " + target);
                    return true;
                } else if (sum > target) {
                    --j;
                } else {
                    ++i;
                }
            }
        }

        return false;
    }
}
