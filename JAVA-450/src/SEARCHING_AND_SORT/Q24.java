package SEARCHING_AND_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int c = s.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            System.out.println(AgressiveCows(arr, arr.length, c));

        }


    }

    public static int AgressiveCows(int[] arr, int n, int c) {
        Arrays.sort(arr);
        int lb = arr[0];
        int ub = 1000000000;

        int ans = 0;


        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            int cow = 1;
            int prev = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] - prev >= mid) {
                    cow++;
                    prev = arr[i];
                    if (c == cow) {
                        break;
                    }
                }
            }
            if (cow == c) {
                ans = mid;
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        return ans;
    }

}
