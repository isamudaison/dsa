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

    //merge two already-sorted arrays into nums1
    public static void mergeSorted(int[] nums1, int m, int[] nums2, int n){
        //pointers
        int p1 = m - 1; // last non-0 int in nums1
        int p2 = n - 1; // last int in nums2
        int p = m + n - 1; // last position in nums1

        //merge from end
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // add in any remaining elements from p2
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

}
