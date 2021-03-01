package ARRAY;

import java.util.HashSet;
import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n ; i++) {
            int l1 = s.nextInt();
            int l2 = s.nextInt();
            int[] arr1 = new int[l1];
            int[] arr2 = new int[l2];
            for (int j = 0; j < l1 ; j++) {
                arr1[j] = s.nextInt();
            }
            for (int j = 0; j < l2 ; j++) {
                arr2[j] = s.nextInt();
            }

            boolean ans = isSubset(arr1,arr2);
            if(ans){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static  boolean isSubset(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr1) {
            set.add(val);
        }

        for (int val: arr2) {
            if(!set.contains(val))
                return false;
        }
        return true;
    }
}
