package STRING;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        System.out.println(EditDistance("abc", "cab", 3, 3  ));
    }

    public static int EditDistance(String str1, String str2, int m, int n) {
       int[][] T = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n; j++) {
                if(i == 0){
                     T[i][j] = j;
                }else if(j == 0){
                    T[i][j] = i;
                }else
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    T[i][j] = T[i-1][j-1];
                }else{

                    T[i][j] = 1+ Math.min(T[i][j-1], Math.min(T[i-1][j], T[i-1][j-1]));
                }

            }
        }

        return T[m][n];

    }

}
