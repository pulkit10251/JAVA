package ARRAY;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        //Ques 2 : Find the maximum and minimum elements of a array
        Scanner s = new Scanner(System.in);
        int[] arr = {10, 30, 40, 60, 33, 99, 5, 145, 65};
        int max = 0, min = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
    }
}
