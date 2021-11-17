package ARRAY;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 3;
        int[] arr = {1,2,3};
//
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int i = 0, j =0;
        int sum = 0;
        int count= 0;
        while(j < nums.length){
            if(sum == k){
                count++;
            }
            if(sum > k){
                while(sum >= k && i < nums.length){
                    sum -= nums[i];
                    i++;
                }
                i = j;
                continue;
            }
            sum += nums[j];
            if(sum <= k){
                j++;
            }

        }
        return count;
    }
}
