package org.creft.data.algorithm.sort;

import org.creft.data.structure.array.ArrayUtility;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {

        String[] stringAry = new String[10];
        int j = 0;

        for(int i = 9; i > -1; i--){

            stringAry[j] = Integer.toString(i);
            j++;

        }
        System.out.println("Pre-sorting: " );
        ArrayUtility.print(Arrays.asList(stringAry));
        System.out.println();
        assertEquals("9", stringAry[0], "Expected first item to be 9");


        List<String> stringList = Arrays.asList(stringAry);
        BubbleSort.sort(stringList);
        System.out.println("Post-sorting list: " );
        ArrayUtility.print(stringList);

        BubbleSort.sort(stringAry);
        System.out.println("Post-sorting array: ");
        System.out.println(Arrays.toString(stringAry));


        assertEquals("0", stringList.getFirst(), "Expected first item to be sorted");

        String[] sortedAry = new String[10];
        stringList.toArray(sortedAry);
        assertEquals("0", stringAry[0], "Expected first item to be 0");
    }
}