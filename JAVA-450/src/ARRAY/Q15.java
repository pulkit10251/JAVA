package ARRAY;

public class Q15 {

    public static void main(String[] args) {
        // Ques 15 : next permutation
        int[] arr = {1,3,2};

        nextPermutation(arr);

    }

    public static void nextPermutation(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        int j = arr.length - 1;
        if (i >= 0) {
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        reverse(arr, i+1,arr.length-1);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }

    }

    public static void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void reverse(int[] A, int i,int j){
        while(i < j){
            swap(A, i++,j--);
        }
    }
}
