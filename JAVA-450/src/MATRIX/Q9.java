package MATRIX;

import java.util.PriorityQueue;

public class Q9 {

    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int res = kthSmallest(mat, 4, 7);

        System.out.print("7th smallest element is "+ res);
    }

    public static  int kthSmallest(int[][] mat, int n, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                minHeap.add(mat[i][j]);
            }
        }


        for (int i = 0; i < k-1 ; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
