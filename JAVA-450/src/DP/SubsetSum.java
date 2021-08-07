package DP;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(targetSum(n, arr, sum));

    }

    public static boolean targetSum(int n , int[] arr, int sum){
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i =0 ; i < dp.length; i++){
            for (int j = 0; j < dp[0].length ; j++) {
               if(i == 0 && j == 0){
                   dp[i][j] = true;
               }else if(i == 0){
                   dp[i][j] = false;
               }else if(j == 0 ){
                   dp[i][j] = true;
               }else{
                   if(dp[i - 1][j]){
                       dp[i][j] = true;
                   }else{
                       int val = arr[i-1];
                       if(j >= val)
                       if(dp[i-1][j-val]){
                           dp[i][j] = true;
                       }
                   }
               }
            }
        }

        return dp[n][sum];
    }


}
