package SEARCHING_AND_SORT;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {

    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5,7,8};
        int k = 23;
        System.out.println(fourSum(arr, k));
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int l, r;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                l = j + 1;
                r = n - 1;


                while (l < r) {
                    if (arr[i] + arr[j] + arr[l] + arr[r] == k) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        l++;
                        r--;
                        result.add(list);
                    } else if (arr[i] + arr[j] + arr[l] + arr[r] < k)
                        l++;
                    else
                        r--;
                }
            }
        }
        return result;
    }
}
