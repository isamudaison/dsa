package org.creft.data.algorithm.sort;

public class QuickSort {

    public static <T extends Comparable> void sort(T[] arrayToSort){

        quickSortHelper(arrayToSort, 0, arrayToSort.length - 1);
    }

    private static <T extends Comparable> void quickSortHelper(T[] array, int low, int high){
        if(low < high){
            int partitionIndex = partition(array, low, high);
            quickSortHelper(array, low, partitionIndex - 1);
            quickSortHelper(array, partitionIndex + 1, high);
        }
    }

    private static <T extends Comparable> int partition(T[] array, int low,int high){
        T pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(array[j].compareTo(pivot) < 1){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    private static <T extends Comparable> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
