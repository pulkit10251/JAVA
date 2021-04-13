package SEARCHING_AND_SORT;

import java.util.ArrayList;

public class Q2 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] == i+1){
                list.add(i);
            }
        }

        return list;
    }
}
