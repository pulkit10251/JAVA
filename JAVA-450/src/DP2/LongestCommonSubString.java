package DP2;

import java.util.Scanner;

public class LongestCommonSubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1,s2));
    }

    public static int solution(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
        }
        return max;
    }
}
