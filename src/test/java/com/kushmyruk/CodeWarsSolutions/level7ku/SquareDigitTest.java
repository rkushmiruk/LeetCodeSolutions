package com.kushmyruk.CodeWarsSolutions.level7ku;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(149, new SquareDigit().squareDigits(123));
        assertEquals(162536, new SquareDigit().squareDigits(456));
    }
}
