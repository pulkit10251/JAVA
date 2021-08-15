package DP;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToSell2TransAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mpist = 0;  //max profit if sold today
        int leastsf = arr[0];
        int[] dpmptdis = new int[n];   // max profit till date if sold;
        for (int i = 1; i < n ; i++) {
            if(arr[i] < leastsf){
                leastsf = arr[i];
            }
            mpist = arr[i] - leastsf;
            dpmptdis[i] = Math.max(mpist, dpmptdis[i-1]);
        }

        int mpibt = 0;
        int maxsofar = arr[n-1];
        int[] dpmptdib = new int[n];
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i] > maxsofar){
                maxsofar = arr[i];
            }
            mpibt = maxsofar - arr[i];
            dpmptdib[i] = Math.max(mpibt, dpmptdib[i+1]);
        }

        int op = 0;
        for (int i = 0; i < n ; i++) {
            op = Math.max(dpmptdib[i] + dpmptdis[i], op);
        }

        System.out.println(op);
    }
}
