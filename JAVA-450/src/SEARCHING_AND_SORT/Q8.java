package SEARCHING_AND_SORT;

import java.util.HashMap;

public class Q8 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr, 5));
    }

    public static int majorityElement(int[] a, int size) {
        int N = size / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.getOrDefault(a[i], 0) > N) {
                return a[i];
            }
        }
        return -1;
    }

}
