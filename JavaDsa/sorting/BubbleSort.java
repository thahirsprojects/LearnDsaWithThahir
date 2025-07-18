import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0;j < array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    public void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args){

        BubbleSort eg = new BubbleSort();

        int[] arr ={23,-23,54,6,1,0};
        System.out.println(Arrays.toString(eg.bubbleSort(arr)));
    }
}
