package com.oliver;

import java.util.Arrays;

public class ThreeSumAnalyzer {

    public boolean analyze(int[] array, int target) {

        if(array != null) {
            Arrays.sort(array);
            TwoSumAnalyzer twoSumAnalyzer = new TwoSumAnalyzer();
            for (int i : array) {
                if (twoSumAnalyzer.analyze(array, target - i)){
                    System.out.println("In ThreeSumAnalyzer: " + i + " + " + (target - i) + " = " + target );
                    return true;
                }
            }
        }

        return false;
    }
}
