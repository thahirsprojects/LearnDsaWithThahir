package Array.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int minIndex=i;
            for(int j = i+1;j < array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array,minIndex,i);
        }
        return array;
    }

    public void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args){

        SelectionSort eg = new SelectionSort();
        int[] arr = {23,-34,0,43,234};

        System.out.println(Arrays.toString(eg.selectionSort(arr)));
    }
}
