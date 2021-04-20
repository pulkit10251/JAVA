package SEARCHING_AND_SORT;

import java.util.Arrays;
import java.util.HashMap;

public class Q18 {

    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2};
        System.out.println(minSwaps(arr, arr.length));
    }

    public static int minSwaps(int[] arr, int n) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            h.put(arr[i], i);
        }
        int[] temp = Arrays.copyOfRange(arr,0, n);

        Arrays.sort(temp);
        int ans = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];

                swap(arr, i, h.get(temp[i]));

                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
