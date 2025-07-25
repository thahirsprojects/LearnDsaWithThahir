package Array.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,11,15,23,43,75};
        int n = 5;
        int found = binarySearch(arr,n);

        if(found != -1) {
            System.out.println("\nElement found in index " + found);
        }
        else {
            System.out.println("\nElement not found !");
        }
    }

    public static int binarySearch(int[] arr,int n){

        int left = 0;
        int right = arr.length-1;

        while (left < right){

            int mid = (left + right) / 2;

            if(arr[mid] == n) {
                return mid;
            }
            else if(arr[mid] < n) {
                left = mid + 1;
            }
            else if(arr[mid] > n){
                right = mid - 1;
            }

        }
        return -1;
    }
}
