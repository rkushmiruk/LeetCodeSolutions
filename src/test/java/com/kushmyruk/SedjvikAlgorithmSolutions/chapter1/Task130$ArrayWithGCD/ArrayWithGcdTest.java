package com.kushmyruk.SedjvikAlgorithmSolutions.chapter1.Task130$ArrayWithGCD;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayWithGcdTest {

    @Test
    public void arrayWithGcdTest() {
        ArrayWithGcd arrayWithGcd = new ArrayWithGcd();
        boolean[][] expected = new boolean[][]{{false, true, false, false}, {true, true, true, true}, {false, true, false, true}, {false, true, true, false}};
        boolean[][] actual = arrayWithGcd.createArrayWithGcd(4);
        assertArrayEquals(expected, actual);
    }
}