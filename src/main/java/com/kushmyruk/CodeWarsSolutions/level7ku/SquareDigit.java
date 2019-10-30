package com.kushmyruk.CodeWarsSolutions.level7ku;

import java.util.stream.Collectors;

/**
 * Welcome. In this kata, you are asked to square every digit of a number.
 *
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 *
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {

    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();

        while (n != 0) {
            result.append(new StringBuilder().append((int) Math.pow(n % 10, 2)).reverse());
            n /= 10;
        }

        return Integer.parseInt(result.reverse().toString());
    }

//    public int squareDigits(int n) {
//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                .map(i -> i * i)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining("")));
//    }
}
