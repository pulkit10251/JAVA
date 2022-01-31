package Uber;

import java.util.Arrays;
import java.util.Scanner;

public class q2xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[][] queries = new int[k][2];
        for(int i = 0; i< k; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            queries[i][0] = l;
            queries[i][1] = r;
        }
//        int[] arr= {1,2,4,8,16,32};
//        int[] arr1 = {8,4,1};
//        int[][] queries = {{1,6},{2,5},{3,4},{1,2}};
        int[] res = function(arr,queries);
        for(int a : res){
            System.out.println(a);
        }
    }

    public static int[] function(int[] arr, int[][] queries){
        int[] res = new int[queries.length];
        int n = arr.length;
        int[][] dp = new int[n][n];
        int[][] result = new int[n][n];
        for (int g =0 ;g < n; g++){
            for(int i = 0, j = g; j < n; j++, i++){
                if(g == 0){
                    dp[i][j] = arr[i];
                    result[i][j] = arr[i];
                }else{
                    dp[i][j] = dp[i+1][j] ^dp[i][j-1];
                    result[i][j] = Math.max(dp[i][j], Math.max(result[i+1][j], result[i][j-1]));
                }
            }
        }

        for(int i = 0; i < res.length; i++){
            int len = queries[i][1] - queries[i][0];
            int row = queries[i][0] -1;
            int col = queries[i][1] -1 ;

            res[i] = result[row][col];
        }
        return res;
    }
}
