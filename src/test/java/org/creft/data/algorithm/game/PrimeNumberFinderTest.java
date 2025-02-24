package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberFinderTest {

    @Test
    void findNextHighestPrime() {

        assertEquals(7, PrimeNumberFinder.findNextHighestPrime(5));

        assertEquals(29, PrimeNumberFinder.findNextHighestPrime(23));

        assertEquals(101, PrimeNumberFinder.findNextHighestPrime(100));

    }
}