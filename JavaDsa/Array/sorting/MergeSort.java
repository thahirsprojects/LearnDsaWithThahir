package Array.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {3,2,6,4,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length==1) {
            return arr;
        }

        int n = arr.length;
        int mid = n/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,n));

        return merge(left,right);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if(a[i] <= b[j]){
                mergedArray[k] = a[i];
                i++;
            }else {
                mergedArray[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < a.length){
            mergedArray[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            mergedArray[k] = b[j];
            j++;
            k++;
        }


        return mergedArray;
    }
}
