package com.kushmyruk.CodeWarsSolutions.level8ku;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDifferenceTest {
    @Test
    public void basicTests() {
        assertEquals(9, SumOfDifference.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifference.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifference.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifference.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifference.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifference.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifference.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifference.sumOfDifferences(new int[]{1}));
    }
}
