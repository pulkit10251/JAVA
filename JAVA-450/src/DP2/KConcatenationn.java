package DP2;

import java.util.Arrays;
import java.util.Scanner;

public class KConcatenationn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k, sum));
    }
    public static int kadane(int[] arr) {
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

    public static int kadanesofTwo(int[] arr){
        int[] narr = new int[arr.length * 2];

        for (int i = 0; i< narr.length; i++){
            narr[i] = arr[ i % arr.length];
        }

        return kadane(narr);
    }
    public static long solution(int[] arr, int k, long sum) {
        if(k == 1){
            return kadane(arr);
        }else if(sum < 0){
            return kadanesofTwo(arr);
        }else{
            return kadanesofTwo(arr) + (k-2)*sum;
        }
    }
}
