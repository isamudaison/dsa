package org.creft.data.algorithm.math;

import java.util.AbstractMap;
import java.util.Map;

public class EfficientExponent {

    // find the number of multiplications to get base ^ exponent, return as an Entry (result, # of multiplications)
    public static Map.Entry<Double, Integer> unsignedPower(double base, int exponent){
        double result = 1.0;
        int multiplicationCount = 0;

        while(exponent > 0){
            if( exponent % 2 == 1){
                //exponent is odd
                result *= base;
                multiplicationCount++;
            }
            base *= base;
            multiplicationCount++;
            exponent /= 2;
        }

        return new AbstractMap.SimpleImmutableEntry<>(result, multiplicationCount);

    }
}
