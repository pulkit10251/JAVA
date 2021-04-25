package SEARCHING_AND_SORT;

import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            for (int i = 0; i < t; i++) {
                int par = s.nextInt();
                int n = s.nextInt();
                int[] arr =new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = s.nextInt();
                }

                System.out.println(RotiPrathaSPOJ(arr, n, par));
            }
    }

    public static boolean solve(int[] a, int par, int mid) {
        int time = 0;
        int paratha = 0;

        for (int i = 0; i < a.length; i++) {
            time = a[i];
            int j = 2;

            while (time <= mid) {
                paratha++;
                time = time + (a[i] * j);
                j++;
            }
            if (paratha >= par) {
                return true;
            }
        }
        return false;

    }

    public static int RotiPrathaSPOJ(int[] arr, int n, int par) {

        int lo = 0;
        int hi = 100000000;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (solve(arr, par, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }
}
