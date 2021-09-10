package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class MnimumPalindromicCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(findPalindromicCut(str));
    }

    public static int findPalindromicCut(String str){
        boolean[][] dp = new boolean[str.length()][str.length()];

        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp.length; j++, i++){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }
            }
        }

        int[] dp2 = new int[str.length()];
        dp2[0] = 0;
        dp2[1] = str.charAt(0) == str.charAt(1) ? 0: 1;

        for(int i =2; i < dp2.length; i++) {
            if (dp[0][i]) {
                dp2[i] = 0;
            } else {
                int min = Integer.MAX_VALUE;
                for (int j = i; j > 0; j--) {

                    if (dp[j][i]) {
                        min = Math.min(dp2[j - 1], min);
                    }

                }
                dp2[i] = min + 1;
            }
        }

        return dp2[dp2.length-1];
    }
}
