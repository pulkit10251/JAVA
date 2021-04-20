package SEARCHING_AND_SORT;

import java.util.HashMap;

public class Q15 {

    public static void main(String[] args) {
        long[] arr = {-1,-2,-3,0,3,2,1};
        System.out.println(findSubarray(arr, arr.length));
    }
    public static long findSubarray(long[] arr ,int n)
    {
        //Your code here
        HashMap<Long, Long> prevSum = new HashMap<>();
        long res = 0;

        long currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if(currSum == 0){
                res++;
            }

            if (prevSum.containsKey(currSum))
                res += prevSum.get(currSum );


            if (prevSum.get(currSum) == null)
                prevSum.put(currSum, 1L);
            else
                prevSum.put(currSum, prevSum.get(currSum) + 1);

        }

        return res;
    }
}
