package MATRIX;

public class Q8 {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int[][] ans =rotate90Clockwise(arr, arr.length, arr[0].length);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][]  rotate90Clockwise(int[][] arr, int m, int n){
        int[][] ans = new int[m][n];

        for (int i = 0; i < m ; i++) {
            for (int j = n-1, k=0; j >= 0 && k < n ; j-- , k++) {
                ans[i][k] = arr[j][i];
            }
        }

        return ans;
    }

}
