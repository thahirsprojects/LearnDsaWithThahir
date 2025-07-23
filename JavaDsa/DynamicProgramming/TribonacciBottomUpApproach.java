package DynamicProgramming;

// Bottom-Up approach
public class TribonacciBottomUpApproach {

    // Tribonachi sequence  = 0,0,1,1,2,4,7......
    public static long tribonachiBottomUpApproach(int n){

        long[] arr = new long[n+1];
        arr[1] = 0;
        arr[2] = 1;
//        int count = 0;

        if(n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) return 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
//            System.out.println(++count);
        }
    return arr[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonachiBottomUpApproach(n));
    }
}
