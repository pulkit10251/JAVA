package MISLANEOUS;

import java.util.Scanner;

public class YAMAHAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diff = n-1;
        int val = 0;
        for(int i = 1; i <= n ;i++){
            val = i;
            diff = n-1;
            for(int j = 1; j <= i; j++){
                System.out.print(val + " ");
                val += diff;
                diff--;
            }
            System.out.println();
        }
    }
}
