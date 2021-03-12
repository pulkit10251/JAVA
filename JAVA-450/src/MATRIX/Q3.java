package MATRIX;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        int[][] A = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        int r = A.length;
        int c = A[0].length;

        System.out.println(median(A, r, c));
    }

    public static int median(int[][] matrix, int r, int c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                min = Math.min(min, matrix[i][j]);

                max = Math.max(max, matrix[i][j]);

            }
        }

        int desired = (r * c + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;

            for (int i = 0; i < r; i++) {
                int get = Arrays.binarySearch(matrix[i], mid);

                if (get < 0) {
                    get = Math.abs(get) - 1;
                } else {
                    while (get < matrix[i].length && matrix[i][get] == mid) {
                        get += 1;
                    }
                }

                place += get;
            }
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }
}
