package DP;

import java.util.Scanner;

public class CoinPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(coinChangePermutations(arr, n, target ));
    }
    public static int coinChangePermutations(int[] arr, int n, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for(int j =0; j< n; j++){
                if(arr[j] <= i)
                    dp[i] += dp[i -arr[j]];
            }
        }

        return  dp[target];
    }
}
