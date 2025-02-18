package org.creft.data.algorithm.sort;

import java.util.List;

public class BubbleSort {

    //In-place bubble sort of a List/Array using generics
    public static<T extends Comparable<T>> void sort(List<T> listToSort){
        int listLength = listToSort.size();

        for(int i = 0; i < listLength; i++){
            T currentItem = listToSort.get(i);

            for(int j = i+1; j < listLength; j++){
                T nextItem = listToSort.get(j);

                if((currentItem).compareTo(nextItem) > 0 ){
                    listToSort.set(j, currentItem);
                    listToSort.set(i, nextItem);
                    currentItem = nextItem;
                }
            }
        }
    }

    //In-place bubble sort of a List/Array using generics
    public static<T extends Comparable<T>> void sort(T[] arrayToSort){

        for(int i = 0; i < arrayToSort.length; i++){
            T currentItem = arrayToSort[i];

            for(int j = i+1; j < arrayToSort.length; j++){
                T nextItem = arrayToSort[j];

                if((currentItem).compareTo(nextItem) > 0 ){
                    T tempVal = arrayToSort[j];
                    arrayToSort[j] = currentItem;
                    arrayToSort[i] = nextItem;
                    currentItem = tempVal;
                }
            }
        }
    }
}
