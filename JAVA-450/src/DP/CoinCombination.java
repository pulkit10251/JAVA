package DP;

import java.util.Scanner;

public class CoinCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(coinchangeCombination(arr, n, target ));
    }

    public static int coinchangeCombination(int[] arr, int n, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for(int j =arr[i]; j< dp.length; j++){
                dp[j] += dp[j -arr[i]];
            }
        }

        return  dp[target];
    }
}
