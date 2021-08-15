package DP;

import java.util.Scanner;

public class BestTimeToSellStocksInfiniteAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <  n; i++) {
            arr[i] = sc.nextInt();
        }

        int profit  = 0;
        int sum = 0;
        for(int i = 1; i< n; i++){
            if(arr[i] <= arr[i-1]){
                profit+=sum;
                sum = 0;
            }else{
                sum += arr[i] - arr[i-1];
            }

        }

        profit = sum + profit;

        System.out.println(profit);
    }
}
