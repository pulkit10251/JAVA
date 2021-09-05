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
        int[][] dp = new int[n][n];

        for(int g = 0; g < n;g++){
            for(int i =0, j = g; j< n;j++, i++){
                if(g==0){
                    dp[i][j] = 1;
                }else if(g==1){
                    dp[i][j] = str.charAt(i) == str.charAt(j)? 2:1;
                }else {
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
        }


        return dp[0][n-1];
    }
}
