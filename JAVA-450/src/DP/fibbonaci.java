package DP;

public class fibbonaci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibonaci(n));
        int[] qb = new int[n+1];
        System.out.println(fibonaciMemo(n, qb));
    }

    public static int fibonaci(int n){
        if(n == 0 || n == 1){
            return  n;
        }
        int fib1 = fibonaci(n-1);
        int fib2 = fibonaci(n-2);

        return  fib1 + fib2;
    }

    public static int fibonaciMemo(int n, int[] qb){
        if(n == 0 || n == 1){
            return  n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }

        int fib1 = fibonaciMemo(n-1, qb);
        int fib2 = fibonaciMemo(n-2, qb);

        qb[n] = fib1+fib2;

        return  fib1 + fib2;
    }
}
