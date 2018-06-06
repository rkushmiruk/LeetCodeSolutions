package com.kushmyruk;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        TwoSum test = new TwoSum();
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        int[] expected = new int[2];
        expected[0] = 0;
        expected[1] = 1;

        int[] actual = test.twoSum(nums, 9);

        assertArrayEquals(expected, actual);
    }


}
