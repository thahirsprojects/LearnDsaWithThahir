package DynamicProgramming;

// Tribonacci TopDown Approach
public class TribonacciTopDownApproach {

//    static int count = 0;
    static int[] arr = new int[100];

    private static int tribonachiTDA(int n){

        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;

        if (arr[n] != 0) return arr[n];

//        System.out.println(++count);
        arr[n] = tribonachiTDA(n-1) + tribonachiTDA(n-2) + tribonachiTDA(n-3);
        return arr[n];
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonachiTDA(n));
    }
}
