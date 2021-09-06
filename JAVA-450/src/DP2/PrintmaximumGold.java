package DP2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrintmaximumGold {
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



    private static class Pair {
        String psf;
        int i;
        int j;

        public Pair(String psf, int i, int j) {
            this.psf = psf;
            this.i = i;
            this.j = j;
        }
    }

    public static void printPath(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];

        for(int i = 0; i< m;i++){
            dp[i][n-1] = arr[i][n-1];
        }
        int index = 0;
        int pmax = Integer.MIN_VALUE;
        for(int j = n-2; j>=0 ; j--){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m ; i++) {
                if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }else if(i == m -1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j+1], Math.max(dp[i][j+1], dp[i+1][j+1]));
                }
                if(dp[i][j] > max){
                    max = dp[i][j];
                    index = i;
                }
            }
            if(max > pmax){
                pmax = max;
            }
        }

        System.out.println(pmax);

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(index+ "", index,0 ));
        while(queue.size() > 0){
            Pair rm = queue.removeFirst();

            if(rm.j == n-1){
                System.out.println(rm.psf);
            }else if(rm.i == 0){
                int g = Math.max(dp[rm.i][rm.j+1], dp[rm.i+1][rm.j+1]);
                if(g == dp[rm.i][rm.j+1] ){
                    queue.add(new Pair(rm.psf+" d2", rm.i, rm.j+1));
                }

                if(g == dp[rm.i+1][rm.j+1]){
                    queue.add(new Pair(rm.psf+" d3", rm.i+1, rm.j+1));
                }


            }else if(rm.i == m-1){
                int g = Math.max(dp[rm.i][rm.j+1], dp[rm.i-1][rm.j+1]);
                if(g == dp[rm.i-1][rm.j+1]){
                    queue.add(new Pair(rm.psf+" d1", rm.i-1, rm.j+1));
                }
                if(g == dp[rm.i][rm.j+1] ){
                    queue.add(new Pair(rm.psf+" d2", rm.i, rm.j+1));
                }

            }else{
                int g = Math.max(dp[rm.i][rm.j+1], Math.max(dp[rm.i-1][rm.j+1], dp[rm.i+1][rm.j+1]));
                if(g == dp[rm.i-1][rm.j+1]){
                    queue.add(new Pair(rm.psf+" d1", rm.i-1, rm.j+1));
                }

                if(g == dp[rm.i][rm.j+1] ){
                    queue.add(new Pair(rm.psf+" d2", rm.i, rm.j+1));
                }

                if(g == dp[rm.i+1][rm.j+1]){
                    queue.add(new Pair(rm.psf+" d3", rm.i+1, rm.j+1));
                }
            }

        }

    }
}
