package com.kushmyruk.CodeWarsSolutions.level8ku;

/**
 * You have to return the digits of this number within an array in reverse order.
 * 348597 => [7,9,5,8,4,3]
 */

public class ReverseInteger {
    public static int[] digitize(long n) {
        int[] result = new int[(int) (Math.ceil(Math.log10(n + 0.5)))];

        for (int i =0; i < result.length; i++) {
            result[i] = Math.toIntExact(n % 10);
            n /= 10;
        }

        return result;
    }

    //String more slow
//    public static int[] digitize(long n) {
//        return new StringBuilder().append(n)
//                .reverse()
//                .chars()
//                .map(Character::getNumericValue)
//                .toArray();
//    }
}
