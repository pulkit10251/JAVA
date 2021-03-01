package ARRAY;

public class Q29 {

    public static void main(String[] args) {
        //Ques 29 : Trapping rainwater problem;
        int[] A = {6, 5, 0, 2, 8, 6, 0, 2, 4, 8, 6};
        RainTrap1(A);
        RainTrap2(A);
        RainTrap3(A);
    }

    public static void RainTrap1(int[] A) {
        int tap = 0;
        for (int i = 1; i < A.length - 1; i++) {

            int maxOnLeft = 0;
            for (int j = 0; j < i; j++) {
                maxOnLeft = Math.max(A[j], maxOnLeft);
            }

            int maxonRight = 0;

            for (int j = i + 1; j < A.length; j++) {
                maxonRight = Math.max(A[j], maxonRight);
            }


            if (maxOnLeft <= A[i] || maxonRight <= A[i]) {
                continue;
            }

            int diff = Math.min(maxOnLeft, maxonRight) - A[i];
            tap += diff;
        }
        System.out.println(tap);
    }

    public static void RainTrap2(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int trap = 0;

        left[0] = A[0];
        right[n - 1] = A[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], A[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], A[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            trap += Math.min(left[i], right[i]) - A[i];
        }

        System.out.println(trap);
    }

    public static void RainTrap3(int[] A){
        int n = A.length;
        int trap = 0 ;
        int left_max = 0;
        int right_max = 0;

        int lo = 0;
        int hi= n-1;

        while(lo <= hi){
            if(A[lo] < A[hi]){
                if(A[lo] > left_max){
                    left_max = A[lo];
                }else{
                    trap += left_max - A[lo];
                    lo++;
                }
            }else{
                if(A[hi] > right_max){
                    right_max = A[hi];
                }else{
                    trap += right_max - A[hi];
                    hi--;
                }
            }
        }

        System.out.println(trap);
    }
}
