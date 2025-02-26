package org.creft.data.algorithm.math;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EfficientExponentTest {

    @Test
    void unsignedPower() {

        Map.Entry<Double, Integer> result = EfficientExponent.unsignedPower(2.0, 10);

        assertEquals(1024.0, result.getKey());
        assertEquals(6, result.getValue());
    }
}