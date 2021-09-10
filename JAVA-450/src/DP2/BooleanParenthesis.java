package DP2;

import java.util.Scanner;

public class BooleanParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1, s2));
    }

    public static int solution(String str1, String str2) {
        int n = str1.length();
        int[][] dpt = new int[n][n];
        int[][] dpf = new int[n][n];


        for (int g = 0; g < n ; g++) {
            for(int i = 0, j = g ; j <n ;j++, i++){
                if(g == 0) {
                    char ch = str1.charAt(i);
                    if (ch == 'T') {
                        dpt[i][j] = 1;
                        dpf[i][j] = 0;
                    } else {
                        dpt[i][j] = 0;
                        dpf[i][j] = 1;
                    }
                }else{
                    for(int k = i ; k < j; k++){
                        char optr = str2.charAt(k);
                        int ltc = dpt[i][k];
                        int rtc = dpt[k+1][j];
                        int lfc = dpf[i][k];
                        int rfc = dpf[k+1][j];


                        if(optr == '&'){
                            dpt[i][j] += ltc * rtc;
                            dpf[i][j] += lfc*rtc + ltc*rfc  + lfc *rfc;
                        }else if(optr == '|'){
                            dpt[i][j] += ltc*rtc + ltc* rfc + rtc*lfc;
                            dpf[i][j] += lfc * rfc;
                        }else{
                            dpt[i][j] += ltc * rfc + rtc * lfc;
                            dpf[i][j] += ltc * rtc + lfc * rfc;
                        }
                    }
                }
            }
        }

        return dpt[0][n-1];
    }
}
