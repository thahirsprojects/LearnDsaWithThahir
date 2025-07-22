package DynamicProgramming;

public class FibonachiTopDownApproach {

    // code might be messy updated in the future
    public static int n = 0;
    public static int count = 0;
    public static int[] arr = new int[100];

    public static int fibonachiTopDown(int n){


        // if the n is o or 1 return the n value.
        if (n <= 1){
            return  n;
        }

        // check for the n value in the arr
        if (arr[n] != 0 ) {
            return arr[n];
        }

        // calculate fibonachi number if not found in the array
        arr[n] = fibonachiTopDown(n-1) + fibonachiTopDown(n-2);

        ++count;
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonachiTopDown(10));
        System.out.println("count = "+count);

    }

}
