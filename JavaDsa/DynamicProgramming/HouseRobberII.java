package DynamicProgramming;

// CIRCULAR ADJACENT
public class HouseRobberII {

    public static void main(String[] args) {
        int[] homes = {5,7,5};
        System.out.println(RobberII(homes));
    }

    private static int RobberII(int[] homes) {

        int[] arr1 = new int[homes.length];
        int[] arr2 = new int[homes.length];

        for (int i = 0; i < homes.length; i++) {
            if (i != 0) arr1[i] = homes[i];
            if (i != homes.length-1) arr2[i] = homes[i];
        }


        return Math.max(MaxRob(arr1),MaxRob(arr2));
    }

    private static int MaxRob(int[] homes) {

        if (homes.length<2) return homes[0];

        int[] maxLoot = new int[homes.length];

        maxLoot[0] = homes[0];
        maxLoot[1] = Math.max(homes[0],homes[1]);

        if(homes.length-1 == 0) return homes[0];

        for (int i = 2; i < homes.length; i++) {
            maxLoot[i] = Math.max(maxLoot[i-2]+homes[i],maxLoot[i-1]);
        }

        return maxLoot[homes.length-1];
    }




}
