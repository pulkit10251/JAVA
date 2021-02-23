package ARRAY;

public class Q20 {

    public static void main(String[] args) {
        //Ques 20 : rearrange a array in alternating positive and negative
        int[] arr = {1, 2, -3, 4, -4, -1, -8};

        int k = 0;



        while (k < arr.length) {
            if (k % 2 == 0 && arr[k] < 0) {
                k++;
            } else if (k % 2 == 0 && arr[k] > 0) {
                int j = k + 1;
                while (j < arr.length && arr[j] > 0) {
                    j++;
                }

                if (j < arr.length)
                    RotateRight(arr, k, j);
                k++;
            } else if (k % 2 == 1 && arr[k] > 0) {
                k++;
            } else if (k % 2 == 1 && arr[k] < 0) {
                int j = k + 1;
                while (j < arr.length && arr[j] < 0) {
                    j++;
                }
                if (j < arr.length)
                    RotateRight(arr, k, j - 1);
                k++;
            }
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }

    public static void RotateRight(int[] A, int i, int j) {
        int data = A[j];
        for (int k = j; k > i; k--) {
            A[k] = A[k - 1];
        }
        A[i] = data;

    }
}
