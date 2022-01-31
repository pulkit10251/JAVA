package DP2;

import java.util.Scanner;

public class EggDrop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //n -> number of eggs and k -> number of floors
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(eggDrop(n,k));
    }

    public static int eggDrop(int n, int k){
        int[][] dp = new int[n+1][k+1];
        for(int e = 1; e< dp.length; e++){
            for (int f = 1; f < dp[0].length ; f++) {
                if(e == 1){
                    dp[e][f] = f;
                }else if(f == 1){
                    dp[e][f] = 1;
                }else{
                    int min = Integer.MAX_VALUE;

                    for(int mj = f-1, pj = 0; mj >=0; mj--, pj++ ){
                        min = Math.min(min, Math.max(dp[e][mj], dp[e-1][pj]));
                    }
                    dp[e][f] = min+1;
                }
            }
        }

        return dp[n][k];
    }
}
