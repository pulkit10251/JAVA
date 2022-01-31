package SEARCHING_AND_SORT;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,9,6,45,32,78,12,5,100,102};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }

        int mid = (lo + hi)/2;
        int pivot = arr[mid];
        int left = lo;
        int right = hi;

        while(left <= right){
            while(arr[left] < pivot){
                left ++;
            }

            while(arr[right] > pivot){
                right --;
            }

            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
    }
}
