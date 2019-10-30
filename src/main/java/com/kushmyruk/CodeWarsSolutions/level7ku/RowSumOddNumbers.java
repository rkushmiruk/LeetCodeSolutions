package com.kushmyruk.CodeWarsSolutions.level7ku;

import java.util.stream.IntStream;

/**
 * Given the triangle of consecutive odd numbers:
 * <p>
 * 1
 * 3     5
 * 7     9    11
 * 13    15    17    19
 * 21    23    25    27    29
 * ...
 * Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
 * <p>
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 */
public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int level1 = n * (n - 1) / 2;
        int level2 = (n + 1) * n / 2;

        int result = 0;
        for (int i = level1 + 1; i <= level2; i++) {
            result += 2 * i - 1;
        }
        return result;
    }

    public static int houseNumbersSum(final int[] arr) {

        return IntStream.of(arr).takeWhile(value -> value == 0).sum(); //coding and coding..
    }

//    public static int rowSumOddNumbers(int n) {
//    /* sum of consequent M numbers is (M+1)M/2, so
//     * we may know how many numbers were below
//     * our ROW : numbersBelow = ((n-1)*(n))/2.
//     * Now we may calculate first number in row:
//     * firstNumberInRow = 2*numbersBelow+1.
//     * So, firstNumberInRow = n*n-n+1 and
//     * last number in ROW is n*n-n+1 + 2(n-1).
//     * Let assume that last number before row is
//     * x1 and last number in row is x2. It's known
//     * that 1+3+5+...+(2k-1) = k*k.
//     * Sum in row must be x2*x2 - x1*x1.
//     // OUR x1 = (n*n-n)/2 and x2 = (n*n+n)/2.
//     * After some simplification: SUM = n*n*n. */
//
//
//        return n * n * n;
//    }
}
