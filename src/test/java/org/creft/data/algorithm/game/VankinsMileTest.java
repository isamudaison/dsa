package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VankinsMileTest {

    @Test
    void maxScoreVankinsMile() {
        int[][] grid = {
                {8, -6, 7, -3},
                {4, 5, -2, 1},
                {3, -4, 9, 6},
                {2, 1, -7, 5}
        };

        assertEquals(35, VankinsMile.maxScoreVankinsMile(grid));
    }
}