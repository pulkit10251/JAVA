package DP;

import java.util.Scanner;

public class BestTimeToSellStocks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <  n; i++) {
            arr[i] = sc.nextInt();
        }
        int  minSoFar = arr[0];

        int profitSoFar = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i] < minSoFar){
                minSoFar = arr[i];
            }else if(arr[i] >=minSoFar){
                profitSoFar = Math.max(profitSoFar, arr[i]- minSoFar);
            }
        }
        System.out.println(profitSoFar);
    }
}
