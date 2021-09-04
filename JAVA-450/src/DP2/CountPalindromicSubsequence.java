package DP2;

import java.util.Scanner;

public class CountPalindromicSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int g = 0; g < n; g++){
            for (int i = 0, j =g ; j < str.length(); i++, j++ ){
                if(g == 0){
                    dp[i][j] = 1;
                }else if(g == 1){
                    if(str.charAt(i)== str.charAt(j)){
                        dp[i][j] = 3;
                    }else{
                        dp[i][j] = 2;
                    }
                }else{
                    if(str.charAt(i)== str.charAt(j)){
                        dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1;
                    }else{
                        dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                    }
                }
            }
        }

        System.out.println(dp[0][n-1]);
    }
}
