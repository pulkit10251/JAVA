package DP;

import java.util.Scanner;

public class BestTimeToSellInfiniteTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <  n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int obsp = -arr[0];
        int ossp = 0;

        for (int i = 0; i < n; i++) {
            int nbsp = 0;
            int nssp = 0;
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }else{
                nbsp = obsp;
            }
            if(obsp + arr[i] - k > ossp){
                nssp = obsp + arr[i] - k;
            }else{
                nssp = ossp;
            }

            ossp = nssp;
            obsp = nbsp;
        }

        System.out.println(ossp);
    }
}
