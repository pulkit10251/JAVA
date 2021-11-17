package DP2;

import java.util.Scanner;

public class MaximumSumTwoOverlapping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(solution(arr, x, y));
    }
    public static int solution(int[] arr, int x, int y){
        int[] dp1 = new int[arr.length];
        int[] dp2 = new int[arr.length];

        int sum = 0;
        for(int i = 0; i < arr.length ;i++){
            if(i < x){
                sum += arr[i];
                dp1[i] = sum;
            }else{
                sum += arr[i] - arr[i-x];
                dp1[i] = Math.max(dp1[i-1], sum);
            }
        }

        for( int i = arr.length-1; i >= 0; i-- ){
            if (i+y >= arr.length){
                sum += arr[i];
                dp2[i] = sum;
            }else{
                sum += arr[i] - arr[i+y];
                dp2[i] = Math.max(dp2[i+1], sum);
            }
        }

        int ans = 0;

        for(int i = x-1; i < arr.length-y ; i++){
            ans = Math.max(ans, dp1[i]+dp2[i+1]);
        }

        dp1 = new int[arr.length];
        dp2 = new int[arr.length];

        sum = 0;
        for(int i = 0; i < arr.length ;i++){
            if(i < y){
                sum += arr[i];
                dp1[i] = sum;
            }else{
                sum += arr[i] - arr[i-y];
                dp1[i] = Math.max(dp1[i-1], sum);
            }
        }

        for( int i = arr.length-1; i >= 0; i-- ){
            if (i+x > arr.length){
                sum += arr[i];
                dp2[i] = sum;
            }else{
                sum += arr[i] - arr[i+x];
                dp2[i] = Math.max(dp2[i+1], sum);
            }
        }


        for(int i = x-1; i < arr.length-y ; i++){
            ans = Math.max(ans, dp1[i]+dp2[i+1]);
        }


        return ans;
    }

}
