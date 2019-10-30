package com.kushmyruk.CodeWarsSolutions.level8ku;

import java.util.Arrays;

/**
 * You will be given an vector of string(s). You must sort it alphabetically (case-sensitive!!) and then return the first value.
 *
 * The returned value must be a string, and have "***" between each of its letters.
 *
 * You should not remove or add elements from/to the array.
 */

public class SortAndStar {
    public static String twoSort(String[] s) {
        String s1 = Arrays.stream(s).sorted().findFirst().orElse("");
        char[] chars = s1.toCharArray();
        StringBuilder result = new StringBuilder();
        for (Character c : chars) {
            result.append(c).append("***");
        }

        return result.toString().substring(0, result.length() - 3);
    }

//    public static String twoSort(String[] s) {
//        java.util.Arrays.sort(s);
//
//        return String.join("***",s[0].split(""));
//    }
}
