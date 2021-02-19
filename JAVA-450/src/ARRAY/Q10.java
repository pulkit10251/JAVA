package ARRAY;

public class Q10 {

    public static void main(String[] args) {
        //Ques 10 : Minimum number of jumps
        int[] A = {1, 2, 3, 1, 0, 1, 2, 0, 6, 8, 9};

        System.out.println(minJumps(A, A.length));

    }

    public static int minJumps(int[] A, int n) {
        int jumps = 1;
        int steps = A[0];
        int maxrange = A[0];
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }
            maxrange = Math.max(maxrange, i + A[i]);
            steps--;
            if (steps == 0) {
                jumps++;

                if (i >= maxrange) {
                    return -1;
                }
                steps = maxrange - i;

            }
        }
        return -1;
    }
}
