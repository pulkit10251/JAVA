package DP2;

import java.util.Scanner;

public class MaximumDifference0and1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(solution(string));
    }
    public static int solution(String str) {
        int sum = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < str.length() ; i++) {
            if(sum < 0){
                sum = 0;
            }
            if(str.charAt(i) == '0'){
                sum += 1;
            }else{
                sum+= -1;
            }
            maxDiff = Math.max(maxDiff, sum);
        }

        return maxDiff < 0 ? -1 : maxDiff;
    }
}
