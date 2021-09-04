package DP2;

import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(LongestPalindromeSubsequences(str));
    }

    public static int LongestPalindromeSubsequences(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];
        StringBuilder str1 = new StringBuilder(str);
        String rev = str1.reverse().toString();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][n];
    }
}
