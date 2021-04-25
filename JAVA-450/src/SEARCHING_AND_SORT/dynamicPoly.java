package SEARCHING_AND_SORT;

import java.util.Arrays;
import java.util.Scanner;


public class dynamicPoly {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[][] array = new int[m][1000];
        s.nextLine();
        for (int i = 0; i < m; i++) {

            String str = s.nextLine();
            String[] strarr = str.split(" ");
            System.out.println(Arrays.toString(strarr));
            int n = strarr.length;
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(strarr[j]);
            }
        }
    }
}
