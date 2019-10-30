package com.kushmyruk.CodeWarsSolutions.level7ku;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisorsOfANumberTest {
    @Test
    public void testSomething() {
        assertEquals(3, DivisorsOfANumber.numberOfDivisors(4));
        assertEquals(2, DivisorsOfANumber.numberOfDivisors(5));
        assertEquals(6, DivisorsOfANumber.numberOfDivisors(12));
        assertEquals(8, DivisorsOfANumber.numberOfDivisors(30));
    }
}
