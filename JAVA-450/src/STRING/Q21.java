package STRING;

import java.util.Arrays;

public class Q21 {
    public static int[][] dp;

    public static void main(String[] args) {
        String str = "abbab";
        int n = str.length();
        System.out.println(n);

        //System.out.println(countSubsequences(str, 0, str.length() - 1));
        //dp = new int[n][n];
//        for (int[] arr : dp) {
//            Arrays.fill(arr, -1);
//        }
//        System.out.println(countSubsequencesDP(str, 0, n - 1));

        System.out.println(countSubsequencesDP(str));
    }

    public static int countSubsequences(String str, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        } else if (str.charAt(i) == str.charAt(j)) {
            return 1 + countSubsequences(str, i + 1, j) + countSubsequences(str, i, j - 1);
        } else {
            return countSubsequences(str, i + 1, j) + countSubsequences(str, i, j - 1)
                    - countSubsequences(str, i + 1, j - 1);
        }
    }

    public static int countSubsequencesDP(String str, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (str.charAt(i) == str.charAt(j)) {
            return dp[i][j] = 1 + countSubsequences(str, i + 1, j) + countSubsequences(str, i, j - 1);
        } else {
            return dp[i][j] = countSubsequences(str, i + 1, j) + countSubsequences(str, i, j - 1)
                    - countSubsequences(str, i + 1, j - 1);
        }
    }

    public static long countSubsequencesDP(String str) {
        int n = str.length();
        long[][] DP = new long[n][n];

        for (int i = 0; i < n; i++) {
            DP[i][i] = 1;
        }

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                int k = l + i - 1;
                if (str.charAt(i) == str.charAt(k)) {
                    DP[i][k] = (DP[i + 1][k] + DP[i][k - 1] + 1)%1000000007;
                } else {
                    DP[i][k] = (DP[i + 1][k] + DP[i][k - 1])%1000000007 - DP[i + 1][k - 1];
                }
            }
        }

        return DP[0][n-1];

    }

}
