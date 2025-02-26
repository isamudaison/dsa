package org.creft.data.structure.array;

import java.io.Serializable;
import java.util.List;

public class ArrayUtility {

    public static <T extends Serializable> void print(List<T> listToPrint){
        System.out.print("[ ");

        for(T item : listToPrint){

            System.out.print(item.toString() + " ");
        }

        System.out.print("]");
    }

    //use xor operation to find a unique element in an array of 2n+1 'married' elements
    public static int findUniqueElement(int[] array){
        int result = 0;
        for(int num : array){
            result ^= num;
        }
        return result;
    }

}
