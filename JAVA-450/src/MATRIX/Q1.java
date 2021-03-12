package MATRIX;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] A = new int[r][c];

        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                A[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        ArrayList<Integer> list = spiralTransversal(A,r,c);
        System.out.println(list.size());
//        System.out.println(list.get(0));
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    public static ArrayList<Integer> spiralTransversal(int[][] A,int r,int c){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int top = 0;
        int right = A[0].length-1;
        int left = 0;
        int bottom = A.length-1;

        int count = 0;


        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list.add(A[top][i]);
                count ++;
            }
            top++;

            if(count < A.length*A[0].length)
                for (int i = top; i <= bottom; i++) {
                    list.add(A[i][right]);
                    count++;
                }
            right--;
            if(count < A.length*A[0].length)
                for (int i = right; i >= left; i--) {
                    list.add(A[bottom][i]);
                    count++;
                }
            bottom--;
            if(count < A.length*A[0].length)
                for (int i = bottom ; i >= top; i--) {
                    list.add(A[i][left]);
                    count++;
                }
            left++;

        }


        return  list;
    }
}
