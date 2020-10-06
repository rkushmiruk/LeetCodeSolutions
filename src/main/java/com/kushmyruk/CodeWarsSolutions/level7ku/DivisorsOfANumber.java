package com.kushmyruk.CodeWarsSolutions.level7ku;

import java.util.stream.IntStream;

/**
 * Count the number of divisors of a positive integer n.
 */
public class DivisorsOfANumber {
    public static long numberOfDivisors(int n) {
        return IntStream.range(1, n + 1).filter(i -> n % i == 0).count();
    }

//    public static long numberOfDivisors(int n) {
//        if (n ==0) {return 0L;}
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n%i == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
}
