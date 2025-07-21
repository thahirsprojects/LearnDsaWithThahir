package Array;

import java.util.Arrays;

public class MergeTwoArray {

    /**
     * TIP ONLY FOR SAME SIZED ARRAY
     */
    public static int[] mergeArray(int[] a,int[] b){
        int mergedSize = a.length + b.length;
        int[] mergedArray = new int[mergedSize];

        for (int i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            mergedArray[a.length+j] = b[j];
        }
        return mergedArray;
    }



    public static void main(String[] args) {
        int[] arr1 = {23,12,43,21};
        int[] arr2 = {45,32,56,20};

        int[] mergedArr = mergeArray(arr1,arr2);

        System.out.println(Arrays.toString(mergedArr));
    }
}
