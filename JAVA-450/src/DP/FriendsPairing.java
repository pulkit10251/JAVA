package DP;

import java.util.Scanner;

public class FriendsPairing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n+1; i++) {
            dp[i]= dp[i-1] + (i-1) * dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
