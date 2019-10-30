package com.kushmyruk.CodeWarsSolutions.level7ku;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the shortest word in streing
 *
 */
public class FindShort {

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).min(Comparator.comparing(String::length)).orElse("").length();
    }
}
