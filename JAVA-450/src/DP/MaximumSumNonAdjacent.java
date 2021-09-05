package DP;

import java.util.Scanner;

public class MaximumSumNonAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int prev_inc = arr[0];
        int prev_exc = 0;
        for (int i = 1; i < n ; i++) {
            int curr_inc = arr[i] + prev_exc;
            int curr_exc = Math.max(prev_inc, prev_exc);

            prev_exc = curr_exc;
            prev_inc = curr_inc;
        }


        System.out.println(Math.max(prev_exc, prev_inc));
    }
}
