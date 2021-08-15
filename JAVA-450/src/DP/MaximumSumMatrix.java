package DP;

import java.util.Arrays;

public class MaximumSumMatrix {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int[][] cost = {{1, 7, 5 ,2}, {5, 12, 3, 6},{100, 9, 23, 16}, {16, 4, 5, 9}};
        for(int[] arr : cost)
            System.out.println(Arrays.toString(arr));
        System.out.println(MaxCost(row,col,cost));
    }

    public static int MaxCost(int row, int col, int[][] cost){
        int[][] dp = new int[row][col];

        for(int i = row-1 ;i >= 0; i--){
            for(int j = col-1; j >= 0; j--){
                if( i == row-1 && j == col-1 ){
                    dp[i][j] = cost[i][j];
                }else if(i == row-1){
                    dp[i][j] = dp[i][j+1] + cost[i][j];
                }else if(j == col-1){
                    dp[i][j] = dp[i+1][j] + cost[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]) + cost[i][j];
                }
            }
        }

        return dp[0][0];
    }
}
