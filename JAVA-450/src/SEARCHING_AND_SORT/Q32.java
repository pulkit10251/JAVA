package SEARCHING_AND_SORT;

import java.util.Scanner;

public class Q32 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            int m = s.nextInt();
            if(m == 0 ){
                break;
            }
            int[] arr1 = new int[m];
            for (int i = 0; i < m; i++) {
                arr1[i] = s.nextInt();
            }

            int n = s.nextInt();
            int[] arr2 = new int[n];
            for (int i = 0; i < n ; i++) {
                arr2[i] = s.nextInt();
            }

            System.out.println(DoubleHelix(arr1,arr2, m, n));
        }
    }

    public static int DoubleHelix(int[] arr1, int[] arr2, int m, int n) {

       int i=0;
       int j = 0;
       int s1 =0, s2 = 0;
       int ans = 0;
       while(i< m && j < n){
           if(arr1[i] < arr2[j]){
                s1 += arr1[i++];
           }else if(arr1[i] > arr2[j]){
               s2 += arr2[j++];
           }else{
               ans+= Math.max(s1,s2) + arr1[i];
               s1 = 0;
               s2 = 0;
               i++;
               j++;
           }
       }

       while (i < m){
           s1+=arr1[i++];
       }

       while (j < n){
           s2+= arr2[j++];
       }

       ans += Math.max(s1,s2);

       return  ans;
    }
}
