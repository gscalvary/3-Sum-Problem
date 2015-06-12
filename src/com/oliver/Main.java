package com.oliver;

public class Main {

    public static void main(String[] args) {

        ThreeSumAnalyzer analyzer = new ThreeSumAnalyzer();
        int[] array = new int[]{1, 3, 5, 7, 8, 16};
        int target = 48;
        System.out.println("Does there exist three elements of the given array that total to " + target + "?");
        System.out.println(analyzer.analyze(array, target));
    }
}
