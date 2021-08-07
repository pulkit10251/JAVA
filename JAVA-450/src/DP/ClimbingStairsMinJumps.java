package DP;

import java.util.Arrays;

public class ClimbingStairsMinJumps {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1,1,1,4,9,8,1,1,10,1};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(MinJumps(n, arr, dp));
        System.out.println(Arrays.toString(dp));
        Arrays.fill(dp, 0);
        System.out.println(DPApproach(n,arr,dp));
        System.out.println(Arrays.toString(dp));

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

    public static int DPApproach(int n, int[] arr, int[] dp){
        //mem -> dp[k] represents minimum no of steps from k to end
        // base case
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            if(arr[i] > 0)
            for(int j =1; j<=arr[i]; j++){
                if(i+j  < dp.length){
                    min = Math.min(min, dp[i+j]);
                }
            }
            dp[i] = min+1;
        }

        return dp[0];
    }
}
