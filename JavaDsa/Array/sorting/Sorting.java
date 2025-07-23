package Array.sorting;

import java.util.Arrays;

public class Sorting {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j+1] < arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }
        printArray(arr);
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length-1 ; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        printArray(arr);
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        printArray(arr);
    }

    public static void mergeSort(int[] arr){

        int n = arr.length;

        int mid = n/2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,n);

        int[] mergedArray = mergeTwoArray(left,right);

        printArray(mergedArray);
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {

        int[] mergedArray = new int[arr1.length+ arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            }else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length){
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    public static void quickSort(int[] arr, int low, int hi){
        int start = low;
        int end = hi;

        int pivot=arr[hi];

        if (start>=end) return;

        while(start < end){

            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if (start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,end);
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
     }

    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5,2,4,1};
//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
