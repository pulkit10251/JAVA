package ARRAY;

import java.util.HashMap;

public class Q18 {

    public static void main(String[] args) {
        // Ques 18 : find all pairs on integer array with sum K
        int[] A = {1, 5, 7, 1};
        int K = 2;
        int count = countPairs(A, K);
        System.out.println(count);
    }

    public static int countPairs(int[] A, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else
                map.put(val, 1);
        }

        for(int i = 0; i < A.length; i++){
            if(map.containsKey(k-A[i])){
                count += map.get(k-A[i]);
                System.out.println(k-A[i] + " " + A[i]);
            }

            if(k - A[i] == A[i]){
                count--;
            }
        }


        return count/2;
    }
}
