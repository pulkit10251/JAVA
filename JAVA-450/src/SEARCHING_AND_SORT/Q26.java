package SEARCHING_AND_SORT;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        EKO_SPOJ(arr, n, m);
    }

    public static boolean solve(int[] arr, int n, int m, int mid){
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            if(arr[i] > mid){
                sum += arr[i] -mid;
            }
        }
        return sum >= m;
    }

    public static void EKO_SPOJ(int[] arr, int n, int m){
        int lo = 0;

        int hi = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            if(arr[i] > hi){
                hi = arr[i];
            }
        }
        int ans = 0;
        while (lo <= hi){
            int mid = (lo + hi)/ 2;

            if(solve(arr,n,m,mid)){
                ans =mid;
                lo = mid+1;
            }else{
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
