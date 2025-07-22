package DynamicProgramming;

public class FibonachiBottomUpApproach {

    public static int fibonachiButtomUP(int n) {

        int[] copy = new int[n+1]; // fibanachi numbers starts from zero so n+1 size.

        copy[0] = 0;
        copy[1] = 1;

        for (int i = 2; i <= n; i++) {
            copy[i] = copy[i-1] + copy[i-2];
        }
        return copy[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonachiButtomUP(n));
    }
}
