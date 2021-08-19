package DP;

import java.util.Arrays;

public class ClimbingStairsMinJumps {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {3,3,0,2,1,2,4,2,0,0};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(MinJumps(n, arr, dp));
        System.out.println(Arrays.toString(dp));
        Integer[] dp1 = new Integer[n+1];
        System.out.println(DPApproach(n,arr,dp1));
        System.out.println(Arrays.toString(dp1));

    }

    public static int MinJumps(int n, int[] arr, int[] dp){
        if(n == 0){
            return 0;
        }else if(n < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= arr[n-1]; i++){
            int a = MinJumps(n-i, arr,dp);
//
            min = Math.min(min, a+1);
        }

        dp[n] = min;

        return  min;
    }

    public static int DPApproach(int n, int[] arr, Integer[] dp){
        //mem -> dp[k] represents minimum no of steps from k to end
        // base case
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                System.out.println(min+" " + i);
                if (min != Integer.MAX_VALUE)
                    dp[i] = min + 1;
            }
        }

        return dp[0];
    }
}
