package DP;

import java.util.Scanner;

public class PartitionsIntoSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][] dp = new long[n+1][k+1];

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length ; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(i < j){
                    dp[i][j] = 0;
                }else if( i == j || j == 1){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i - 1][j] * j + dp[i - 1][j - 1];
                }
            }
        }

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "             ");
            }
            System.out.println();
        }

        System.out.println(dp[n][k]);
    }
}
