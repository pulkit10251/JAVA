package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        int maxSum = dp[0];

        for(int i =1;i<n;i++){
            int max = 0;

            for (int j = 0; j < i ; j++) {
                if(arr[j] <= arr[i]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+arr[i];

            maxSum = Math.max(maxSum, dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(maxSum);
    }
}
