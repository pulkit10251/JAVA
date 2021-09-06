package DP2;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        int len = 1;
        for(int g= 0 ; g < n; g++){
            for (int i = 0, j = g; j < n ; i++, j++) {
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    dp[i][j] = str.charAt(i) == str.charAt(j);
                }else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    len = g +1;
                }
            }

        }
        System.out.println(len);

        int i,j;
        for(i = 0, j = len-1 ; j <n; i++, j++){
            if(dp[i][j]){
                break;
            }
        }


        System.out.println(str.substring(i,j+1));
    }
}
