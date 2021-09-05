package DP2;

import java.util.Scanner;

public class MinSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                min = Math.min(min, dp[i-j*j]);
            }
            dp[i] = min+1;
        }

        System.out.println(dp[n]);

    }
}
