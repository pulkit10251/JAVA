package MATRIX;

import java.util.Arrays;

public class Q5 {


    public static void main(String[] args) {
        int[][] mat = {{1,5,8},{2,4,9},{7,6,3}};

        int[][] ans = SortMat(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length ; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }


    public static int[][]  SortMat(int[][] A){
        int[] temp = new int[A.length* A[0].length];

        int k=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                temp[k] = A[i][j];
                k++;

            }
        }


        Arrays.sort(temp);

        int[][] mat = new int[A.length][A[0].length];
        k=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                A[i][j] = temp[k];
                k++;
            }
        }

        return mat;
    }

}
