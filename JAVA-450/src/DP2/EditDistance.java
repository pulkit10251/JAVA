package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1,s2));
    }

    public static int solution(String str1, String str2) {
       int[][] dp = new int[str1.length()+1][str2.length()+1];

        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0){
                    dp[i][j] = j;
                }else if(j == 0){
                    dp[i][j] = i;
                }else{
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                }
            }
        }
       return dp[str1.length()][str2.length()];
    }
}
