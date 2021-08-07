package DP;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0 ; i <r; i++){
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[r][c];

        int ans = goldMine(r, c, arr, dp);
        System.out.println(ans);

        for (int i = 0; i < r; i++) {
            for (int j =0 ;j < c; j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();

        }
    }

    public static  int goldMine(int r, int c, int[][] arr, int[][] dp){
        // dp[i][j] => means maximum possible sum from i,j towards right
        // direction => right -> left

        for(int j = c-1; j >= 0; j--){
            for(int i = 0; i < r ; i++){
                if(j == c-1){
                    dp[i][j] = arr[i][j];
                }else if(i == 0){
                    dp[i][j] = Math.max(dp[i+1][j+1], dp[i][j+1])+ arr[i][j];
                }else if(i == r-1){
                    dp[i][j] = Math.max(dp[i-1][j+1], dp[i][j+1]) + arr[i][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j+1], Math.max(dp[i][j+1], dp[i+1][j+1])) + arr[i][j];
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < r; i++){
            max = Math.max(dp[i][0], max);
        }

        return max;
    }
}
