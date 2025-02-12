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

}
