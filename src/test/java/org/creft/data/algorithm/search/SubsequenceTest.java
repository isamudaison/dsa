package org.creft.data.algorithm.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceTest {

    @Test
    void containsSubSequence() {

        List<Integer> mainList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> subList1 = Arrays.asList(3, 4, 5);
        List<Integer> subList2 = Arrays.asList(2, 4, 5);
        List<Integer> subList3 = Arrays.asList(3, 2, 5);


        assertTrue(Subsequence.containsSubSequence(mainList, subList1));
        assertTrue(Subsequence.containsSubSequence(mainList, subList2));
        assertFalse(Subsequence.containsSubSequence(mainList, subList3));

    }
}