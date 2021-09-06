package DP2;

import DP.KnapSack01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrintAllResults0_1Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cost = new int[n];
        for (int i = 0; i <n ; i++) {
            cost[i] = sc.nextInt();
        }

        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        KnapSack01(cost, arr,target);
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

    public static void KnapSack01(int[] val, int[] wt, int cap){
        int[][] dp = new int[val.length+1][cap+1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j<dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    if(wt[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][j-wt[i-1]]);
                    }
                }

            }
        }

        System.out.println(dp[val.length][cap]);
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(wt.length, cap, "" ));
        while(queue.size() > 0){
            Pair rm = queue.removeFirst();

            if(rm.i == 0 || rm.j == 0){
                System.out.println(rm.psf);
            }else{
                int exc = dp[rm.i-1][rm.j];
                if(rm.j >= wt[rm.i-1]) {
                    int inc = dp[rm.i - 1][rm.j - wt[rm.i - 1]] + val[rm.i - 1];

                    if (dp[rm.i][rm.j] == inc) {
                        queue.add(new Pair(rm.i - 1, rm.j - wt[rm.i - 1],  (rm.i - 1)+ " "+rm.psf));
                    }
                }

                if(dp[rm.i][rm.j] == exc){
                    queue.add(new Pair(rm.i-1, rm.j, rm.psf));
                }
            }
        }


    }
}
