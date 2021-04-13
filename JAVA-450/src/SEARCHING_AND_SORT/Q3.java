package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(SearchRotated(arr, 3));
    }

    public static int SearchRotated(int[] arr, int target){

        int n =arr.length;
        int pivot =0;

        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1] ){
                pivot = i;
            }
        }
        int[] left_arr = Arrays.copyOfRange(arr, 0, pivot+1);
        int[] right_arr = Arrays.copyOfRange(arr, pivot+1, n);


        int search_left = Arrays.binarySearch(left_arr, target);
        int search_right = Arrays.binarySearch(right_arr, target);
        int ans = 0;
        if(search_left < 0 && search_right <0 ){
            return -1;
        }
        if(search_left < 0 ){
            ans = left_arr.length + search_right;
        }else {
            ans = search_left;
        }
        return ans;
     }
}
