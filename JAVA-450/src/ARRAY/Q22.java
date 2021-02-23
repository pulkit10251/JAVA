package ARRAY;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        // Ques 12 : Factorial of large number
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            factorial(a);
        }
    }

    public static void factorial(int n) {
        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;

        for (int i = 2; i <= n ; i++) {
            res_size = multiply(res, i, res_size);

        }

        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);

    }
    public static int multiply(int[] res, int val, int res_size ){
        int carry = 0;
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * val + carry;
            res[i] = prod % 10;
            carry = prod/10;
        }
//        System.out.println(carry);
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;

    }
}
