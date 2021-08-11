package DP;

import java.util.Scanner;

public class PaintKFences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(paintFences(n, k));
    }

    public static long paintFences(int n, int k){
       long same = k;
       long diff = k* (k-1);
       long total = same + diff;
        for (int i = 2; i < n ; i++) {
            same = diff;
            diff = total * (k-1);

            total = same + diff;
        }

        return total;


    }
}
