package com.kushmyruk.LeetCodeSolutions.Task1$TwoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        TwoSum test = new TwoSum();
        int[] nums = new int[4];
        nums[0] = 8;
        nums[1] = 2;
        nums[2] = 7;
        nums[3] = 15;

        int[] expected = new int[2];
        expected[0] = 1;
        expected[1] = 2;

        int[] actual = test.twoSum(nums, 9);

        assertArrayEquals(expected, actual);
    }


}
