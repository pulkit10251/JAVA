package LEETCODE;

import java.util.Arrays;

public class AntiDiagnols {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        StringBuilder str = new StringBuilder(""+ -121);
        String str1 = str.toString();
        System.out.println(str);
        String str2 = str.reverse().toString();
        System.out.println(str2);
        System.out.println(str1.equals(str2));
//        System.out.println(Arrays.toString(antiDiagnols(arr1)));
    }
    
    public static int[] antiDiagnols(int[][] arr){
        int[] res = new int[arr.length * arr[0].length];
        int idx = 0;
        int sign = 0;
        
        for(int d = 0; d < arr[0].length; d++){
            if(sign == 1){
                int i = 0;
                int j = d;
                while(i <= d || j >= 0){
                    res[idx] = arr[i][j];
                    idx++;
                    i++;
                    j--;
                }
                sign = 0;
            }else if(sign == 0){
                int i = Math.min(d, arr.length - 1);
                int j = 0;
                while(i >= 0){
                    res[idx] = arr[i][j];
                    idx++;
                    i--;
                    j++;
                }
                sign =1;
            }
        }
        return res;
    }
}
