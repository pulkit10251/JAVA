package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(climbingStairs(n, memo));
        System.out.println(Arrays.toString(memo));
    }

    public static int climbingStairs(int n, int[] memo){
        if( n  ==  0){
            return 1;
        }else if( n < 0){
            return 0;
        }
        if(memo[n] != -1){
            return memo[n];
        }

        int a  =climbingStairs(n-1, memo) ;
        int b = climbingStairs(n-2, memo) ;
        int c = climbingStairs(n-3, memo) ;

        memo[n] = a+b+c;

        return a+b+c;


    }
}
