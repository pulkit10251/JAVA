package SEARCHING_AND_SORT;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int q = s.nextInt();

            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[j][k] = s.nextInt();
                }
            }


            for (int k = 0; k < q; k++) {
                int l = s.nextInt();
                System.out.println(getKthSmallest(arr, l));
            }
        }


    }

    public static int getKthSmallest(int[][] arr, int k) {
        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] < start) {
                start = arr[i][0];
            }
            if (arr[i][1] > end) {
                end = arr[i][1];
            }
        }

        if (start + k - 1 <= end) {
            return start + k - 1;
        }

        return -1;
    }
}
