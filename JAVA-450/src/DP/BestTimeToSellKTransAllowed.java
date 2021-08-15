package DP;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToSellKTransAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int[][] dp = new int[k+1][n];

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length ; j++) {
                if(i ==0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    int max = Integer.MIN_VALUE;
                    for(int l = j-1; l >=0; l--){
                        max = Math.max(max, dp[i-1][l] + arr[j] - arr[l]);
                    }
                    dp[i][j] = Math.max(dp[i][j-1], max);
                }
            }

        }

        System.out.println(dp[k][n-1]);

    }
}
