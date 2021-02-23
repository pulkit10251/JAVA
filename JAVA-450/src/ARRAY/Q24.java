package ARRAY;

import java.util.HashSet;

public class Q24 {

    public static void main(String[] args) {
        // Ques 24 : Longest contiguous subsequence
        int[] A = {1, 9, 3, 10, 4, 20, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int val : A) {
            set.add(val);
        }
        int ans = 0;
        for (int val : A) {
            if (!set.contains(val-1)) {
                int j = val;

                while (set.contains(j)) {
                    j++;
                }

                ans = Math.max(ans, j - val);

            }
        }
        System.out.println(ans);
    }
}
