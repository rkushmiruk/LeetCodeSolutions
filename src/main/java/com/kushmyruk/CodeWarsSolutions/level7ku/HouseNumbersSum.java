package com.kushmyruk.CodeWarsSolutions.level7ku;

import java.util.stream.IntStream;

public class HouseNumbersSum {

    public static int houseNumbersSum(final int[] arr) {
        return IntStream.of(arr).takeWhile(value -> value != 0).sum();
    }
}
