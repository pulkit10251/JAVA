package ARRAY;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class Q14 {

    public static void main(String[] args) {
        //Ques 14 Merge Intervals

        int[][] arr = {{1, 4}, {0, 2}, {3, 5}};
        int[][] res = MergeIntervals(arr);


        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                    System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] MergeIntervals(int[][] arr) {
        java.util.Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] <= end) {
                    if(end < arr[j][1] )
                        end = arr[j][1];

                    i++;
                }

            }
            int[] a1 = {start, end};
            list.add(a1);
            k++;
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];

        }
        return res;
    }
}
