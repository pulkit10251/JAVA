package DP2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PrintPathMinimumJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n];
        Solution(n, arr, dp);
    }

    public static class Pair{
        int i;
        int s;
        int j;
        String psf;

        public Pair(int i, int s,int j, String psf) {
            this.i = i;
            this.s = s;
            this.j = j;
            this.psf = psf;
        }
    }

    public static void Solution(int n, int[] arr, Integer[] dp){
        //mem -> dp[k] represents minimum no of steps from k to end
        // base case
        dp[n-1] = 0;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }

                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        System.out.println(dp[0]);

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0, arr[0], dp[0], 0+""));
        while(queue.size() > 0){
            Pair rm = queue.removeFirst();
            int min = Integer.MAX_VALUE;
            if(rm.j == 0){
                System.out.println(rm.psf+ " .");
            }
            for(int j =1; j <= rm.s && rm.i + j < arr.length; j++){
                int ci = rm.i + j;
                if(dp[ci]!= null && dp[ci] == rm.j-1){
                    queue.add(new Pair(ci, arr[ci], dp[ci], rm.psf + " -> "+ci ));
                }
            }
        }
    }
}
