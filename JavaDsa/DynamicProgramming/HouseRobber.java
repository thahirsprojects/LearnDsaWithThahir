package DynamicProgramming;

public class HouseRobber {


    public static void main(String[] args) {
        int[] homes = {5,7,3,2,4,5};
        System.out.println(Robber(homes));
    }

    private static int Robber(int[] homes) {

        if (homes.length<2) return homes[0];

        int[] maxLoot = new int[homes.length];

        maxLoot[0] = homes[0];
        maxLoot[1] = Math.max(homes[0],homes[1]);

        for (int i = 2; i < homes.length; i++) {
            System.out.println("i = "+i+" MaxLoot = "+Math.max(maxLoot[i-2]+homes[i],maxLoot[i]-1));
            maxLoot[i] = Math.max(maxLoot[i-2]+homes[i],maxLoot[i-1]);
        }

        return maxLoot[homes.length-1];
    }
}
