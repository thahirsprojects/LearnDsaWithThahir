package Array.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[]  arr = {7,3,6,2,1};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low,int high) {

        if (low >= high){
            return ;
        }

        int start = low;
        int end = high;

        int m = start + (end-start) / 2;
        int pivot = arr[m];

        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                Sorting.swap(arr,start,end);
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}
