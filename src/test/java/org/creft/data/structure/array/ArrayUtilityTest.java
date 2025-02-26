package org.creft.data.structure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilityTest {

    @Test
    void findUniqueElement() {

        assertEquals(1, ArrayUtility.findUniqueElement(new int[]{4,3,2,4,1,3,2}));
    }
}