package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAsciiDelete {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1, s2));
    }
    public static int solution(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i ==0 && j == 0){
                    dp[i][j] = 0;
                }else if(i == 0){
                    dp[i][j] = (int) s2.charAt(j-1) + dp[i][j-1];
                }else if(j == 0){
                    dp[i][j] = (int) s1.charAt(i-1) + dp[i-1][j];
                }else{
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] =  dp[i-1][j-1];
                    }else{
                        dp[i][j] = Math.min(((int)s1.charAt(i-1) + dp[i-1][j]), ((int)s2.charAt(j-1) + dp[i][j-1]));
                    }
                }
            }
        }


        return dp[n][m];
    }
}
