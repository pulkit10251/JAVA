package DP2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PrintMinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printPath(arr);
    }
    public static class Pair{
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf) {
            this.i = i;
            this.j = j;
            this.psf = psf;
        }
    }
    public static void printPath(int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];
        int m = arr.length;
        int n = arr[0].length;
        for (int i = m-1; i >=0 ; i--) {
            for(int j = n-1; j>=0; j--) {
                if(i == m-1 && j == n-1){
                    dp[i][j] = arr[i][j];
                }else if(i == m-1){
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                }else if(j == n-1){
                    dp[i][j] = arr[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        for (int i = 0; i < m ; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[0][0]);

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,0,""));

        while(queue.size() > 0){
            Pair rm = queue.removeFirst();

            if(rm.i == m-1 && rm.j == n-1) {
                System.out.println(rm.psf);
            }else if(rm.i == m-1){
                queue.add(new Pair(rm.i, rm.j+1,rm.psf+"H"));
            }else if(rm.j == n-1){
                queue.add(new Pair(rm.i+1, rm.j,rm.psf+"V"));
            }else {
                if(dp[rm.i+1][rm.j]  == dp[rm.i][rm.j+1]){
                    queue.add(new Pair(rm.i+1, rm.j, rm.psf+ "V"));
                    queue.add(new Pair(rm.i, rm.j+1, rm.psf+ "H"));
                }else{
                    if(dp[rm.i+1][rm.j] < dp[rm.i][rm.j+1]){
                        queue.add(new Pair(rm.i+1, rm.j, rm.psf+ "V"));
                    }else{
                        queue.add(new Pair(rm.i, rm.j+1, rm.psf+ "H"));
                    }
                }
            }
        }
    }
}
