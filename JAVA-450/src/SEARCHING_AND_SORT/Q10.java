package SEARCHING_AND_SORT;

import java.util.Arrays;

public class Q10 {


    public static void main(String[] args) {
        int[] arr =  {90, 70, 30, 80, 50};
        int n = 60;
        System.out.println(findPair(arr,n));
    }
    public static boolean findPair(int[] arr,int n) {
        int size = arr.length;

        Arrays.sort(arr);

        int i = 0, j = 1;

        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                return true;
            } else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
        return false;
    }
}
