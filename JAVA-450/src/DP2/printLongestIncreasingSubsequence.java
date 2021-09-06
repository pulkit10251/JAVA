package DP2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printLongestIncreasingSubsequence {

    public static class Pair {
        int l;
        int i;
        int v;
        String psf;

        Pair(int l, int i, int v, String psf) {
            this.l = l;
            this.i = i;
            this.v = v;
            this.psf = psf;
        }
    }

    public static void solution(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxLength = dp[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
            if (maxLength < dp[i]) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(maxLength, maxIndex, arr[maxIndex], arr[maxIndex] + "" ));
        while(queue.size() > 0 ){
            Pair rem = queue.removeFirst();
            if(rem.l == 1){
                System.out.println(rem.psf);
            }
            for(int j =0 ;j < rem.i; j++){
                if(dp[j] == rem.l-1 && arr[j] <= rem.v){
                    queue.add(new Pair(dp[j], j, arr[j], arr[j] + "->"+ rem.psf));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);

        sc.close();
    }
}
