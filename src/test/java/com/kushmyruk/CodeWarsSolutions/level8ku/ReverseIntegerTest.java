package com.kushmyruk.CodeWarsSolutions.level8ku;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseIntegerTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ReverseInteger.digitize(35231));
    }
}