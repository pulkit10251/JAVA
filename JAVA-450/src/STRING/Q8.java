package STRING;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            System.out.println(LongestPalindromicSubstring(str));
        }
    }

    public static String LongestPalindromicSubstring(String str) {
        int[][] mat = new int[str.length()][str.length()];
        int max_length = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < mat.length; i++) {
            mat[i][i] = 1;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                mat[i][i + 1] = 1;
                max_length = 2;
                start = i;

            }
        }


        for (int i = 3; i <= mat.length; i++) {
            for (int j = 0; j < str.length() - i +1; j++) {
                int k = i + j -1;
                if (str.charAt(j) == str.charAt(k) && mat[j + 1][k - 1] == 1) {
                    mat[j][k] = 1;
                    if (i  > max_length) {
                        max_length = i ;
                        start = j;
                    }

                }
            }
        }


        return str.substring(start, start+ max_length);
    }
}
