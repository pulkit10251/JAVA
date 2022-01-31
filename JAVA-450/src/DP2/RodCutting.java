package DP2;

import java.util.Scanner;

public class RodCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i < dp.length;i++){
            int max = 0;
            for (int j = 1; j <= i ; j++) {
                max = Math.max(max, dp[i-j] + cost[j-1]);
            }
            dp[i] = max;
            System.out.print(dp[i]+" ");
        }
        System.out.println(dp[n]);
    }
}
