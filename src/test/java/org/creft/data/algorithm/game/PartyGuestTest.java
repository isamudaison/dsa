package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartyGuestTest {

    @Test
    void findMaxGuestTime() {

        List<int[]> guests = Arrays.asList(
                new int[]{1, 4},
                new int[]{2, 6},
                new int[]{5, 8},
                new int[]{3, 7},
                new int[]{9, 12}
        );

        assertEquals("Maximum guests were present at time: 3 with 3 guests.", PartyGuest.findMaxGuestTime(guests));
    }
}