package org.creft.data.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericTruncationTest {

    @Test
    void checkPatternMatch() {

        String pattern = "i18n";
        String concrete = "internationalization";

        boolean doesMatch = NumericTruncation.checkPatternMatch(pattern, concrete);

        assertTrue(doesMatch);
    }

    @Test
    void checkPatternMatchFail() {

        String pattern = "i17n";
        String concrete = "internationalization";

        boolean doesMatch = NumericTruncation.checkPatternMatch(pattern, concrete);

        assertFalse(doesMatch);
    }
}