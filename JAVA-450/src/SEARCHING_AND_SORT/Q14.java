package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        int[] A = {10,12};
        int[] B = {5,18,20};
        merge(A, B, 2, 3);

        merge(A,B, A.length, B.length, 0);
    }
    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int j = n-1;

        for(int i = m-1; i >=0; i--){
            if(arr2[i] < arr1[j]){
                int temp = arr2[i];
                arr2[i] = arr1[j];
                arr1[j] = temp;
            }

            if(arr1[j] < arr1[j-1]){
                j--;
            }
        }

        Arrays.sort(arr1);

        for (int i = 0; i < n ; i++) {
            System.out.print(arr1[i] +" ");
        }

        for (int i = 0; i < m ; i++) {
            System.out.print(arr2[i] +" ");
        }
    }

    public static void merge(int[] arr1, int[] arr2, int m , int n ,int zero){
        int i = 0, j = 0, k = m - 1;
        while (i <= k && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int l = 0; l < m ; l++) {
            System.out.print(arr1[l] +" ");
        }

        for (int l = 0; l < n ; l++) {
            System.out.print(arr2[l] +" ");
        }
    }
}
