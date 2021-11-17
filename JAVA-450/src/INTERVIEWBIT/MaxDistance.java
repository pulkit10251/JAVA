package INTERVIEWBIT;

import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] LMin = new int[n];
        int[] RMax = new int[n];
        LMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i-1]);
        }

        RMax[0] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            RMax[i] = Math.max(arr[i], RMax[i+1]);
        }
        int MaxDiff = -1;
        int i = 0;
        int j = 0;

        while(i < n && j < n){
            if(LMin[i] <= RMax[j]){
                MaxDiff = Math.max(MaxDiff, j-i);
                j += 1;
            }else{
                i += 1;
            }
        }

        System.out.println(MaxDiff);
    }
}
