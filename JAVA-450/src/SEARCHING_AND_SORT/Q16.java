package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q16 {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
    }

    public static long[] productExceptSelf(int[] arr, int n) {
        long[] result = new long[n];

        if (n == 1) {
            return result;
        }

        long[] left = new long[n];
        long[] right = new long[n];

        int i, j;

        left[0] = 1;

        right[n - 1] = 1;

        for (i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }
        for (j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        for (int k = 0; k < n; k++) {
            result[k] = left[k] * right[k];
        }

        return result;
    }
}
