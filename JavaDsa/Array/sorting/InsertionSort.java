package Array.Sorting;

public class InsertionSort {

    public void insertionsort(int[] arr){

//        for (int i = 0; i < arr.length-1; i++){
//            for (int j = i+1; j > 0; j--) {
//                if (arr[j] < arr[j-1]){
//                    swap(arr,j,j-1);
//                }else{
//                    break;
//                }
//            }
//        }

        // The key-based version is generally preferred
        // because it reduces the number of assignments and is more efficient in practice.
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        printarray(arr);
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printarray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        
        int[] array = {76,-22,0,24,12};
        InsertionSort obj = new InsertionSort();
        obj.insertionsort(array);
        

    }
}
