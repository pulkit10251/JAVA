package MISLANEOUS;

import java.util.Arrays;

public class JOSHQ3 {
    public static void main(String[] args) {
        int[] arr= {1, 18 , 19, 50, 64, 72, 91};
        int n = arr.length;
        int[] t = getRes(arr, n);
    }

    public static int[] getRes(int[] arr, int n){
        int[] diff = new int[n];

        for(int i = 0 ; i < n-1; i++){
            int cd = arr[i+1] - arr[i];
            int first = arr[i] - (i)*cd;
            int sum = 0;
            for(int j = 0; j < n; j++){
                diff[j] = (first + j*cd) - arr[j] ;
                sum += Math.abs(diff[j]);
            }
            System.out.println(sum);
            System.out.println(Arrays.toString(diff));
        }

        return diff;
    }
}
