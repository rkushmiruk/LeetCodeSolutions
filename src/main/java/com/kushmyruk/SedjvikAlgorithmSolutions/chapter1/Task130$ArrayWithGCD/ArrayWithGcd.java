package com.kushmyruk.SedjvikAlgorithmSolutions.chapter1.Task130$ArrayWithGCD;

public class ArrayWithGcd {
    public boolean[][] createArrayWithGcd(int size) {
        boolean[][] array = new boolean[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (gcd(i, j) == 1) {
                    array[i][j] = true;
                }
            }
        }

        return array;
    }

    private static int gcd(int i, int j) {
        if (j == 0) return i;
        int temp = i % j;
        return gcd(j, temp);
    }
}
