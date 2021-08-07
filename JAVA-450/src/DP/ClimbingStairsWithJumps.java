package DP;

import java.util.Arrays;

public class ClimbingStairsWithJumps {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {3,3,0,2,1,2,4,2,0,0};
        int[] dp = new int[n+1];
        System.out.println(DPAproach(n, arr, dp));
        Arrays.fill(dp, -1);

        System.out.println(ClimbingStairsVariableJumps(n, arr, dp));
        System.out.println(Arrays.toString(dp));
    }

    public static int ClimbingStairsVariableJumps(int n, int[] arr, int[] dp){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int sum = 0;
        for(int i = 1; i <= arr[n-1]; i++){
            int a = ClimbingStairsVariableJumps(n-i, arr,dp);
            sum+=a;
        }

        dp[n] = sum;

        return sum;
    }

    public static  int DPAproach(int n, int[] arr, int[] dp){
        // meaning : No. of ways to go to 6
        // direction : right to left;
        int len = dp.length;
        System.out.println(Arrays.toString(dp));
        dp[n] = 1;

        for(int i = n -1 ; i>=0; i--){
            for(int j =1; j <= arr[i]; j++){
                if(i+j < dp.length)
                    dp[i] += dp[i+j];
            }
        }

        return dp[0];
    }
}
