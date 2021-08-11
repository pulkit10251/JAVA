package DP;

import java.util.Scanner;

public class TilesMxN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(countNoOf(n,3));
    }

    public static  int countNoOf(int n, int m){

        int[] dp = new int[n+1];

        for (int i = 1; i <= n ; i++) {
            if( i < m){
                dp[i] = 0;
            }else if(i == m){
                dp[i] = 2;
            }else {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }
                

        return dp[n];
    }



}
