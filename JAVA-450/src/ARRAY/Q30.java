package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        int[] A = {3, 4, 1, 9, 56, 7, 9, 12};

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int l = s.nextInt();
            int[] A = new int[l];
            for (int j = 0; j <l ; j++) {
                A[j] = s.nextInt();
            }
            int K = s.nextInt();
            ChocolateDistribution(A,K);
        }

    }

    public static void ChocolateDistribution(int[] A, int K){
        Arrays.sort(A);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= A.length - K; i++) {
            minDiff = Math.min(minDiff, A[i + K - 1] - A[i]);
        }
        System.out.println(minDiff);
    }
}
