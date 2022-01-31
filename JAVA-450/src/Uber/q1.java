package Uber;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int sum = countKdivPairs(arr, n, k);

        System.out.println(sum);
    }

    public static int countKdivPairs(int[] arr, int n, int k){
        int[] freq = new int[k];
        int ans = 0;
        for(int i = 0; i < n; i++){
            int rem = arr[i] % k;
            ans += freq[(k-rem) %k];
            freq[rem]++;
        }
        return ans;


//        System.out.println(Arrays.toString(freq));
//
//        int sum = freq[0] * (freq[0] - 1)/2;
//
//        for (int i = 1; i <= k / 2 && i != (k - i); i++)
//            sum += freq[i] * freq[k - i];
//
//        sum += freq[k/2]*(freq[k/2] - 1)/2;
//        return sum;
    }
}
