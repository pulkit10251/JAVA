package DP2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrintAllPathsTargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetSum(n, arr,target);
    }

    public static class Pair{
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf){
            this.i = i;
            this.j = j;
            this.psf = psf;
        }
    }

    public static void targetSum(int n , int[] arr, int sum){
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i =0 ; i < dp.length; i++){
            for (int j = 0; j < dp[0].length ; j++) {
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(j == 0 ){
                    dp[i][j] = true;
                }else{
                    if(dp[i - 1][j]){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];
                        if(j >= val)
                            if(dp[i-1][j-val]){
                                dp[i][j] = true;
                            }
                    }
                }
            }
        }

        System.out.println(dp[n][sum]);
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(dp.length - 1,dp[0].length-1, ""));

        while(queue.size() > 0) {

            Pair rm = queue.removeFirst();
            if (rm.i == 0 || rm.j == 0) {
                System.out.println(rm.psf);
            } else {
                boolean exc = dp[rm.i - 1][rm.j];
                if (exc) {
                    queue.add(new Pair(rm.i - 1, rm.j, rm.psf));
                }
                if (rm.j >= arr[rm.i - 1]) {
                    boolean inc = dp[rm.i - 1][rm.j - arr[rm.i - 1]];
                    if (inc) {
                        queue.add(new Pair(rm.i - 1, rm.j - arr[rm.i -1], (rm.i - 1) + " " + rm.psf));
                    }
                }
            }
        }

    }
}
