package ARRAY;

import java.util.HashMap;

public class Q21 {

    public static void main(String[] args) {
        // Ques 21 :  Subarrau with 0 sum

        int[] A = {4, 2, -3, 1, 6};

        boolean res = subArrayExists(A);

        System.out.println(res);

    }

    public static boolean subArrayExists(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int val : A
        ) {
            sum += val;
            if (sum == 0) {
                return true;
            }
            if (map.containsKey(sum)) {
                return true;
            }
            map.put(sum, 1);
        }
        return false;
    }

}

