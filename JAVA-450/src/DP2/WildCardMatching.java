package DP2;

import java.util.Scanner;

public class WildCardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(wildCard(str1, str2));
    }

    public static boolean wildCard(String s1, String s2){
        boolean[][] dp = new boolean[s2.length()+1][s1.length()+1];

        for(int i = dp.length-1; i>=0; i--){
            for(int j = dp[0].length-1; j>=0; j--){
                if(i == dp.length-1 && j == dp[0].length-1  ){
                    dp[i][j] = true;
                }else if(i == dp.length-1){
                    dp[i][j] = false;
                }else if(j == dp[0].length-1){
                    if(s2.charAt(i) == '*'){
                        dp[i][j] = dp[i+1][j];
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s2.charAt(i) == '?' || s2.charAt(i) == s1.charAt(j)){
                        dp[i][j] = dp[i+1][j+1];
                    }else if(s2.charAt(i) == '*'){
                        dp[i][j] = dp[i+1][j] || dp[i][j+1];
                    }else{
                        dp[i][j] = false;
                    }
                }
            }
        }

        return dp[0][0];
    }
}
