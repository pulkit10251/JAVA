package ARRAY;

public class Q36 {

    public static void main(String[] args) {
        int[] A = {1, 12, 15, 26, 38};
        int[] B = {2, 13, 17, 30, 45};

        int l = A.length;
        int[] C = new int[A.length + 1];
        int j = 0;
        int k = 0;
        for (int i = 0; i < C.length; i++) {
            if (A[j] < B[k]) {
                C[i] = A[j];
                j++;
            } else {
                C[i] = B[k];
                k++;
            }
        }
        int ans = (C[C.length - 2] + C[C.length - 1]) / 2;
        System.out.println(ans);

        System.out.println(getMedian(A, B, 0, 0, A.length-1, B.length-1));
    }

    public static int getMedian(int[] A, int[] B, int startA, int startB, int endA, int endB) {
        if (endA - startA == 1) {
            return (Math.max(A[startA], B[startB]) + Math.min(A[endA], B[endB])) / 2;
        }

        int m1 = median(A, startA, endA);
        int m2 = median(B, startB, endB);

        if (m1 == m2) {
            return m1;
        } else if (m1 < m2) {
            return getMedian(A, B, (endA + startA + 1) / 2, startB, endA, (endA + startA + 1) / 2);
        } else {
            return getMedian(A, B, startA, (endB + startB + 1) / 2, (endA + startA + 1) / 2, endB);
        }

    }

    public static int median(int[] A, int start, int end) {
        int n = end - start + 1;
        if (n % 2 == 0) {
            return (
                    A[start + (n / 2)] + A[start + (n / 2 - 1)]) / 2;
        } else {
            return A[start + n / 2];
        }
    }
}
