package ARRAY;

public class Q8 {

    public static void main(String[] args) {
        //QUES 8: Find largest sum contiguous subArray

        int[] A = {-2,-3,4,-1,-2,1,5,-3};
        int max = -10000;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                max = Math.max(sum, max);
            }
        }

        System.out.println("Maximum Sum subarray : "+max);
    }
}
