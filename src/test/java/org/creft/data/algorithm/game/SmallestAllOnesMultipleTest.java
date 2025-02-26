package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestAllOnesMultipleTest {

    @Test
    void findSmallestN() {

        assertEquals(6, SmallestAllOnesMultiple.findSmallestN(13));
    }
}