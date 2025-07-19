package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    
    public static int[] mergeArray(int[] a,int[] b){
        int mergedSize = a.length + b.length;
        int[] mergedArray = new int[mergedSize];
        int i = 0, j = 0, k = 0;

        // Merge when both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                mergedArray[k] = a[i];
                k++;
                i++;
            } else {
                mergedArray[k] = b[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements from a
        while (i < a.length) {
            mergedArray[k] = a[i];
            k++;
            i++;
        }

        // Copy remaining elements from b
        while (j < b.length) {
            mergedArray[k++] = b[j++];
            k++;
            j++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {23,24,27,34};
        int[] arr2 = {17,25,30,35};
        
        int[] mergedArray = mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

}
