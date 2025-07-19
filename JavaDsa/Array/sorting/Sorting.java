package Array.sorting;

public class Sorting {

    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j+1] < arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }
        printArray(arr);
    }

    public void selectionSort(int[] arr){
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

    public void insertionSort(int[] arr){
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

    public void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {0,-563,43,90};
        Sorting sort = new Sorting();
        sort.bubbleSort(array);
        sort.selectionSort(array);
        sort.insertionSort(array);

    }
}
