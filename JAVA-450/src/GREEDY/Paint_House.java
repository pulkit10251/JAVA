package GREEDY;

import java.util.Scanner;

public class Paint_House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < 3 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(paintHouses(arr));
    }
    public static int paintHouses(int[][] arr){
        int oldred = arr[0][0];
        int oldblue = arr[0][1];
        int oldgreen = arr[0][2];

        for (int i = 1; i < arr.length; i++) {
            int newred = Math.min(oldblue, oldgreen) + arr[i][0];
            int newblue = Math.min(oldred, oldgreen) + arr[i][1];
            int newgreen = Math.min(oldblue, oldred) + arr[i][2];

            oldblue = newblue;
            oldgreen = newgreen;
            oldred = newred;
        }

        return  Math.min(Math.min(oldblue, oldgreen), oldred);
    }
}
