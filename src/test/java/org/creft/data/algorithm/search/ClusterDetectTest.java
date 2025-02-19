package org.creft.data.algorithm.search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClusterDetectTest {

    @Test
    void findClusters() {

        assertEquals(new HashSet<>(Arrays.asList(3, 2, 1)), new HashSet<>(ClusterDetect.findClusters(new Integer[][]{{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}})));
        assertEquals(new HashSet<>(Arrays.asList(2, 1, 21, 5, 2, 1)), new HashSet<>(ClusterDetect.findClusters(new Integer[][]{
                {1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0},
        {1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
        {0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1}})));
        assertEquals(Collections.emptySet(), new HashSet<>(ClusterDetect.findClusters(new Integer[][]{{0, 0, 0}, {0, 0, 0}})));
        assertEquals(new HashSet<>(Arrays.asList(1)), new HashSet<>(ClusterDetect.findClusters(new Integer[][]{{1}})));

    }

}