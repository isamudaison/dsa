package org.creft.data.structure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilityTest {

    @Test
    void findUniqueElement() {

        assertEquals(1, ArrayUtility.findUniqueElement(new int[]{4,3,2,4,1,3,2}));
    }

    @Test
    void mergeSorted() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        ArrayUtility.mergeSorted(nums1, m, nums2, n);

        assertEquals(Arrays.toString(new int[]{1,2,2,3,5,6}), Arrays.toString(nums1));

    }
}