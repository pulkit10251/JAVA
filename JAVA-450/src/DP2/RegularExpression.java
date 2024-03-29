package DP2;

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(regularExp(str1, str2));
    }

    public static boolean regularExp(String s, String p){
        boolean[][] dp = new boolean[p.length()+1][s.length()+1];

        for(int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length ; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(j == 0){
                    if(p.charAt(i-1) == '*'){
                        dp[i][j] = dp[i-2][j];
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(p.charAt(i-1) == '.' || p.charAt(i-1) == s.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else if(p.charAt(i-1) == '*'){
                        if(dp[i-2][j]){
                            dp[i][j] = true;
                        }else{
                            if(p.charAt(i-2) == '.' || p.charAt(i-2) == s.charAt(j-1)){
                                dp[i][j] = dp[i][j-1];
                            }else{
                                dp[i][j] = false;
                            }
                        }
                    }else{
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[p.length()][s.length()];
    }
}
