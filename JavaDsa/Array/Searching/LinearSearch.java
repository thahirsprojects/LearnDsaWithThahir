package Array.Searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2,4,57,234,35,23};
        int n1 = 57;
        int n2 = 4;

        int found = linearSearch(arr,n2);

        if(found != -1) {
            System.out.println("\nElement found in index " + found);
        }
        else {
            System.out.println("\nElement not found !");
        }
    }

    private static int linearSearch(int[] arr,int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }

        return -1;
    }
}
