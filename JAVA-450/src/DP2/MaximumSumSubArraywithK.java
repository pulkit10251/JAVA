package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumSubArraywithK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

    public static int solution(int[] arr, int k) {
        int[] dp = new int[arr.length];

        dp[0] = arr[0];

        int sum = 0;

        for(int i = 1; i < arr.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum+=arr[i];
            dp[i] = Math.max(sum, dp[i-1] + arr[i]);
        }
        int winSum = 0;
        for(int i = 0; i <k; i++){
            winSum += arr[i];
        }
        int ans =Integer.MIN_VALUE;

        ans = Math.max(ans, winSum);
        for(int i = k; i < dp.length; i++){
            winSum = winSum + arr[i] - arr[i-k];
            System.out.println(winSum);
            ans = Math.max(winSum, ans);
            ans = Math.max(winSum + dp[i-k], ans);
        }


        System.out.println(Arrays.toString(dp));

        return ans;
    }
}
