package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q7 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3,1,8,1,9};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }

    public static int[] findTwoElement(int[] arr, int n) {
        Arrays.sort(arr);
        int i;

        int[] result = new int[2];
        System.out.print("The repeating element is ");

        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else {
                result[0] = abs_val;
            }
        }

        for (int j = 0; j < n ; j++) {
            System.out.println(arr[j]);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i+1;
            }
        }

        return result;
    }
}
