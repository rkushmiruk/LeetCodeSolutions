package com.kushmyruk.SedjvikAlgorithmSolutions.chapter1.Task126$SortOf3Numbers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortOf3NumbersTest {

    @Test
    public void sortOf3NumbersTest() {
        SortOf3Numbers sortOf3Numbers = new SortOf3Numbers();
        double[] expected = new double[]{1.3, 2.6, 7.7};
        double[] actual = sortOf3Numbers.sort3Numbers(7.7, 2.6, 1.3);
        assertArrayEquals(expected, actual, 0.01);
    }
}
