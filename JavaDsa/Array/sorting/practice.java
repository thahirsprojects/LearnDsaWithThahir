package Array.sorting;

import java.util.Arrays;

import static Array.sorting.Sorting.swap;

public class practice {

    /**
     * Practice area
     */

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {32,-342,5,4,3};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }


}
