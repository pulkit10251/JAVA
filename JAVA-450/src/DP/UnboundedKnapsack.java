package DP;

import java.util.Arrays;
import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cost = new int[n];
        for (int i = 0; i <n ; i++) {
            cost[i] = sc.nextInt();
        }

        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(UnboundedKnapsackfunc(n, arr, cost, target));
    }

    public static int UnboundedKnapsackfunc(int n,int[] arr, int[] cost, int target){
        int[] dp = new int[target+1];
        dp[0] = 0;

        for(int i = 1; i < dp.length; i++){
            int max = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] <= i)
                    max =  Math.max(max, dp[i - arr[j]] + cost[j]);
            }
            dp[i] = max;
        }
        System.out.println(Arrays.toString(dp));

        return dp[target];
    }
}
