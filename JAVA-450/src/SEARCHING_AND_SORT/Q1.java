package SEARCHING_AND_SORT;

import java.util.ArrayList;

public class Q1 {

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(FirstAndLast(arr, arr.length, 5));
    }

    public static ArrayList<Long> FirstAndLast(long[] arr, int n, int x) {
        ArrayList<Long> list = new ArrayList<>();
        long start = -1;
        long end = -1;
        for (int i = 0; i < n; i++) {
            if ((i==0 && arr[i]==x) || (arr[i] == x && arr[i-1] !=x)) {
                start = i;
            }
            if(i == n-1 && arr[i]==x || arr[i]==x && arr[i+1] != x){
                end = i;
            }
        }
        list.add(start);
        list.add(end);

        return list;
    }
}
