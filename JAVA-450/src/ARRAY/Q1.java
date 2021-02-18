package ARRAY;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("QUES 1 : REVERSE a ARRAY !");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            // Filling values
            array[i] = s.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
