package org.creft.data.algorithm.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {

        Integer[] arr = {6, 3, 8, 5, 2, 7, 4, 1};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));

    }
}