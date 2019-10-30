package com.kushmyruk.LeetCodeSolutions.Task1108$DefangingAnIPAddress;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangingAnIPAddressTest {

    @Test
    public void defangIPaddrTest() {
        DefangingAnIPAddress defangingAnIPAddress = new DefangingAnIPAddress();
        String expected = "1[.]1[.]1[.]1";
        String actual = defangingAnIPAddress.defangIPaddr("1.1.1.1");
        assertEquals(expected, actual);
    }
}