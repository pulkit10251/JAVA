package ARRAY;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {
        // Ques 28 : find triplet that sum to a given value;
        int[] A = {1,4,45,6,10,8};
        int X = 26;
        System.out.println(isTripletSum(A,X));
    }

    public static boolean isTripletSum(int[] A, int X){

        for (int i = 0; i < A.length-2 ; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = X - A[i];

            for (int j = i+1; j < A.length ; j++) {
                if(set.contains(curr_sum - A[j])){
                    return  true;
                }
                set.add(A[j]);
            }
        }
        return false;
    }
}
