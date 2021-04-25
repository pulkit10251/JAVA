package SEARCHING_AND_SORT;

import java.util.Arrays;

public class infyQ2 {

    public static void main(String[] args) {
        int[][] rec = {{7, 4, 1, 7, 7, 7, 4},
                      {10, 2, 4, 6, 8, 10, 7},
                       {5, 2, 3, 3, 10, 1, 3},
                       {7, 6, 10, 8, 1, 8, 4}};

//        int[][] rec = {{2,2,3,1},{3,2,3,2}};

//        int[][] rec = {{2,3}};

        System.out.println(second(rec));
    }

    public static int second(int[][] rec) {
        for (int[] val : rec ) {
            Arrays.sort(val);
        }

        for (int[] val : rec) {
            System.out.println(Arrays.toString(val));
        }
        int sum = 0;
        for (int i = 0; i < rec[0].length ; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < rec.length; j++){
                if(max < rec[j][i]){
                    max = rec[j][i];
                }
            }
            sum+=max;
        }

        return sum;
    }
}
