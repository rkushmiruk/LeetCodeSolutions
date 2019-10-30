package com.kushmyruk.CodeWarsSolutions.level8ku;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckDigitTest {
    @Test
    public void fixedTests() {
        assertFalse(CheckDigit.isDigit(""));
        assertTrue(CheckDigit.isDigit("7"));
        assertFalse(CheckDigit.isDigit(" "));
        assertFalse(CheckDigit.isDigit("a"));
        assertFalse(CheckDigit.isDigit("a5"));
        assertFalse(CheckDigit.isDigit("14"));
    }
}
