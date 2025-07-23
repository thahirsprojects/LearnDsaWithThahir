package DynamicProgramming;

public class FibonacciTopDownApproach {

    public static int count = 0;
    public static int[] arr = new int[100];

    public static int fibonacciTopDown(int n){

        if (n <= 1){
            return  n;
        }

        if (arr[n] != 0 ) {
            return arr[n];
        }

        arr[n] = fibonacciTopDown(n-1) + fibonacciTopDown(n-2);

//        ++count;
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciTopDown(1));
//        System.out.println("count = "+count);

    }

}
