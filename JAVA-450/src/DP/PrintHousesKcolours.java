package DP;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrintHousesKcolours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(paintHouses(arr));
    }

    public static  int paintHouses(int[][] arr){

        int[][] dp = new int[arr.length][arr[0].length];
        int n = dp[0].length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = arr[0][i];

            if(arr[0][i] <= min1){
                min2 = min1;
                min1 = arr[0][i];
            }else if(arr[0][i] <= min2) {
                min2 = arr[0][i];
            }
        }


        for(int i = 1; i < dp.length; i++){
            int newMin1 = Integer.MAX_VALUE;
            int newMin2  =Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length ; j++) {
                if(arr[i-1][j] == min1)
                    dp[i][j] = min2 + arr[i][j];
                else
                    dp[i][j] = min1 + arr[i][j];

                if(dp[i][j] <= newMin1){
                    newMin2 = newMin1;
                    newMin1 = dp[i][j];
                }else if(dp[i][j] <= newMin2) {
                    newMin2 = dp[i][j];
                }

            }
            min1 = newMin1;
            min2 = newMin2;
//            System.out.println(min1 + " " + min2);
        }

      return min1;

    }
}
