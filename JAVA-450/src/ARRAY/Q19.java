package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19 {

    public static void main(String[] args) {

        // Ques 19  :  Find common element in 3 sorted array
        int[] A = {1, 1, 1};
        int[] B = {1, 1, 1};
        int[] C = {1, 1, 1};

        ArrayList<Integer> list = commonElement(A, B, C);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<Integer> commonElement(int[] A, int[] B, int[] C) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < A.length && j < B.length && k < C.length) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if(!list.contains(A[i]))
                    list.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }


        return list;
    }
}
