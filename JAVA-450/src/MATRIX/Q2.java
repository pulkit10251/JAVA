package MATRIX;

public class Q2 {

    public static void main(String[] args) {
        // Ques 2 : Search element in 2D matrix
        int[][] A = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        System.out.println(MatrixSearch(A,34));

    }

    public static boolean MatrixSearch(int[][] A, int ele ){
        for (int i = 0; i < A.length; i++) {
            if(A[i][0] == ele){
                return true;
            }
            if(A[i][A[0].length-1] >= ele){
                int val = binarySearch(A[i], ele, 0, A[i].length);
                if(val == -1){
                    return false;
                }else{
                    return true;
                }

            }
        }
        return false;
    }

    public static int binarySearch(int[] A, int ele, int start, int end) {

        if (end >= start) {

            int mid = (start + end) / 2;

            if (A[mid] == ele) {
                return mid;
            }
            if (A[mid] > ele) {
                return binarySearch(A, ele, start, mid - 1);
            } else {
                return binarySearch(A, ele, mid + 1, end);
            }
        }
        return -1;
    }
}
