package com.kushmyruk.CodeWarsSolutions.level8ku;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WellOfIdeasTest {
    @Test
    public void basicTests() {
        assertEquals("Fail!", WellOfIdeas.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", WellOfIdeas.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", WellOfIdeas.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
