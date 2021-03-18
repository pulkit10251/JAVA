package MATRIX;

import java.util.HashMap;

public class Q10 {

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9},
                };

        printCommonElements(mat);
    }

    public static void printCommonElements(int[][] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A[0].length; i++) {
            map.put(A[0][i], 1);
        }

        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (map.get(A[i][j]) != null && map.get(A[i][j]) == i) {
                    map.put(A[i][j], i + 1);

                    if (i == A.length - 1) {
                        System.out.println(A[i][j]);
                    }
                }
            }
        }
    }
}
