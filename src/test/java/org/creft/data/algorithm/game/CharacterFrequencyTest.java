package org.creft.data.algorithm.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyTest {

    @Test
    void findMostFrequent() {

        String mostCommonCs = "ABCCCabccDECCC";
        String result = CharacterFrequency.findMostFrequent(mostCommonCs).toString();
        assertEquals("[C]", result);

        String mostCommonABC = "ABCabcABC";
        String result2 = CharacterFrequency.findMostFrequent(mostCommonABC).toString();
        assertEquals("[A, B, C]", result2);

        String mostCommonHello = "helloworld";
        String result3 = CharacterFrequency.findMostFrequent(mostCommonHello).toString();
        assertEquals("[l]", result3);
    }
}