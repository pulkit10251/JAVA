package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q13 {

    public static void main(String[] args) {
        int[] A = {5,1,3,4,7};
        System.out.println(countTriplets(A, 5 ,12));
    }

    public static int countTriplets(int[] A, int n, int sum) {
        Arrays.sort(A);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                if (A[i] + A[j] + A[k] >= sum) {
                    k--;
                } else{
                    ans += k - j;
                    j++;
                }
            }
        }

        return ans;
    }
}
