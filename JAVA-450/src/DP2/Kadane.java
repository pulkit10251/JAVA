package DP2;

import java.util.Scanner;

public class Kadane {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
