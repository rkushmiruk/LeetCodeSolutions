package com.kushmyruk.CodeWarsSolutions.level7ku;

/**
 * A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7.
 * In other words, subtract twice the last digit from the number formed by the remaining digits.
 * Continue to do this until a number known to be divisible or not by 7 is obtained;
 * you can stop when this number has at most 2 digits because you are supposed to know if a number of
 * at most 2 digits is divisible by 7 or not.
 * <p>
 * The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.
 * <p>
 * Examples:
 * <p>
 * 1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.
 * <p>
 * The number of steps to get the result is 1.
 * <p>
 * 2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
 * <p>
 * 3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.
 */
public class DivSeven {

    //dont like this

    public static long[] seven(long m) {
        long ceil = (long) Math.ceil(Math.log10(m + 0.5));
        long resultNumber = 0;
        long count = 0;

        while (ceil != 1) {
            resultNumber = m / 10 - 2 * m % 10;
            m = resultNumber;
            ceil = (long) Math.ceil(Math.log10(m + 0.5));
            count++;
            if (ceil == 2) break;
        }

        return new long[]{resultNumber, count};
    }
}
