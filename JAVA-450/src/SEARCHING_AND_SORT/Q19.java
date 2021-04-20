package SEARCHING_AND_SORT;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] =s.nextInt();
        }
        int q = s.nextInt();

        for (int i = 0; i < q ; i++) {
            int p = s.nextInt();

            int[] ans = BishuAndSoldiers(arr, n, p);
            System.out.println(ans[1]+" "+ans[0]);
        }
    }

    public static int[] BishuAndSoldiers(int[] arr, int n, int p){
        int[] ans = new int[2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] <= p){
                count++;
                ans[0]+= arr[i];
            }
        }

        ans[1] = count;

        return  ans;
    }
}
