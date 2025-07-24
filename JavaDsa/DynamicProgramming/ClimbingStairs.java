package DynamicProgramming;

public class ClimbingStairs {


    public static void main(String[] args) {
        System.out.println(climbingStairs(4));
    }

    private static int climbingStairs(int n) {

        int[] arr = new int[n+1];

        if(n==0 || n==1) return 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = (i-1) + (i-2);
        }

        return arr[n];
    }
}
