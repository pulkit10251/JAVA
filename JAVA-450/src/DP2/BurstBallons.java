package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class BurstBallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }


    public static int solution(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        for(int g = 0; g < n; g++){
            for(int i = 0, j = g ;j < n; j++, i++){
                int max = Integer.MIN_VALUE;
                for(int k = i; k<=j; k++){
                    int left = k == i ? 0 : dp[i][k-1];
                    int right = k == j ? 0 : dp[k+1][j];
                    int val = ( i== 0 ? 1 : arr[i-1]) * arr[k] * (j == n-1 ? 1 : arr[j+1]);

                    int mval = left + right + val;
                    max = Math.max(mval ,max);
                }

                dp[i][j] = max;
            }
        }


        return  dp[0][n-1];
    }
}
