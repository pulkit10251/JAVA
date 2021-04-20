package SEARCHING_AND_SORT;

import java.util.Arrays;
import java.util.Comparator;

public class Q17 {

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        sortBySetBitCount(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortBySetBitCount(Integer[] arr, int n) {

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int c1 = Integer.bitCount(o1);
                int c2 = Integer.bitCount(o2);
                if (c1 <= c2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

    }
}
