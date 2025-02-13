package org.creft.data.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable> void sort(T[] arrayToSort){

        if(arrayToSort.length < 2) return; // nothing to sort

        int midPoint = arrayToSort.length / 2;
        T[] leftAry = Arrays.copyOfRange(arrayToSort, 0, midPoint);
        T[] rightAry = Arrays.copyOfRange(arrayToSort, midPoint, arrayToSort.length);

        sort(leftAry);
        sort(rightAry);

        mergeSortHelper(arrayToSort, leftAry, rightAry);
    }

    private static <T extends Comparable> void mergeSortHelper(T[] totalArray, T[] leftAry, T[] rightAry){
        int i = 0, j = 0, k= 0;

        while(i < leftAry.length && j < rightAry.length){
            if(leftAry[i].compareTo(rightAry[j]) < 1){
                totalArray[k++] = leftAry[i++];

            }else totalArray[k++] = rightAry[j++];
        }
        while(i < leftAry.length){
            totalArray[k++] = leftAry[i++];
        }
        while(j < rightAry.length){
            totalArray[k++] = rightAry[j++];
        }
    }
}
