package DP;

import java.util.Scanner;

// COUNT OF BINARY STRING WITH NO CONSECUTIVE ZEROS
public class CountBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int res = countBinaryNoZero(n);
        System.out.println(res);
        System.out.println(countBinary(n));
    }

    public static int countBinaryNoZero(int n){
        int[] dp0 = new int[n+1];
        int[] dp1 = new int[n+1];
        dp0[1] = 1;
        dp1[1] = 1;
        for(int i = 2; i < dp0.length; i++){
            dp0[i] = dp1[i-1];
            dp1[i] = dp1[i-1] + dp0[i-1];
        }

        return dp0[n] + dp1[n];
    }
    public static  int countBinary(int n){
        int oldZeros = 1;
        int oldOnes = 1;

        for(int i= 2; i< n+1; i++){
            int newZero = oldOnes;
            int newOnes = oldOnes + oldZeros;

            oldZeros = newZero;
            oldOnes = newOnes;
        }

        return oldOnes + oldZeros;
    }
}
