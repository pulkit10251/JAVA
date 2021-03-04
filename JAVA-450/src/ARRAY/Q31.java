package ARRAY;

import java.util.Arrays;

public class Q31 {

    public static void main(String[] args) {
        // Ques 31: smallest subArray with sum greater than x
        int[] arr = {1, 4, 45, 6, 0, 19};
        int X = 51;
        System.out.println(smallestSubarray(arr,X));


    }
    public static  int smallestSubarray(int[] arr,int X){
        int minLen = arr.length +1;
        for (int start = 0; start < arr.length ; start++) {
            int curr_sum = arr[start];

            if(curr_sum  > X){
                return 1;
            }

            for(int end = start+1; end < arr.length; end++){
                curr_sum += arr[end];
                if(curr_sum > X && (end - start+1 )< minLen){
                    minLen = end - start +1;
                }
            }

        }
        return minLen;
    }
}
