package SEARCHING_AND_SORT;

public class Q9 {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;

        System.out.println("Element " + x +
                " is present at index "
                + search(arr, k, x));

    }

    public static int search(int[] arr, int k, int x){

        int i = 0;
        int n = arr.length;
        while (i < n) {

            if (arr[i] == x)
                return i;

            i = i + Math.max(1, Math.abs(arr[i]
                    - x) / k);
        }

        System.out.println("number is " +
                "not present!");
        return -1;
    }
}
