package ARRAY;

public class Q26 {

    public static void main(String[] args) {
        // Maximum profit by buying and selling a share atmost twice
        int[] A = {2, 30, 15, 10, 8, 25, 80, 35, 25, 68, 110};
        int profit = 0;

        for (int i = 1; i < A.length; i++) {
            int sub = A[i] - A[i - 1];
            if (sub > 0) {
                System.out.println(sub);
                profit += sub;
            }
        }
        System.out.println(profit);
    }
}
