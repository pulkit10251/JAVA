package LEETCODE;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        int n = cost.length+1;
        dp[n-1] = 0;

        for(int i = n-2; i >= 0; i--){
            if(i+2 < n)
                dp[i] = Math.min(dp[i+1]+cost[i-1], dp[i+2]+cost[i-1]);
            else{
                dp[i] = cost[i-1] + dp[i+1];
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}
