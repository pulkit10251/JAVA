package DP;

import java.util.Scanner;

public class KnapSack01 {
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
        System.out.println(KnapSack(n, arr, cost, target));
    }

    public static int KnapSack(int n,int[] arr, int[] cost, int target){
        int[][] dp = new int[n+1][target+1];

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length ; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(j >= arr[i-1]){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i - 1]] + cost[i - 1]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
    }
}
