package com.kushmyruk.CodeWarsSolutions.level8ku;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Your task is to sum the differences between consecutive pairs in the array in descending order.
 *
 * For example: sumOfDifferences([2, 1, 10]) Returns 9
 *
 * Descending order: [10, 2, 1]
 *
 * Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
 *
 * If the array is empty or the array has only one element the result should be 0
 */
public class SumOfDifference {
//    public static int sumOfDifferences(int[] arr) {
//        int result = 0;
//        int[] reverseArr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(e -> e).toArray();
//        for (int i = 0; i < arr.length - 1; i++) {
//            result += reverseArr[i] - reverseArr[i + 1];
//        }
//        return result;
//    }

    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }
}
