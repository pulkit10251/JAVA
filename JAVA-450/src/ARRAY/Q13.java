package ARRAY;

public class Q13 {

    public static void main(String[] args) {
        // Kadane's Algorithm - DP

        int[] A = {-5,6,-1,-5,-8,5,6,-1,2,3};
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (sum + A[i] > 0) {
                sum += A[i];
            } else {
                sum = 0;
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);


    }
}
