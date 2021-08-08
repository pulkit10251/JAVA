package DP;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        long res = countBinary(n);
        System.out.println(res);
    }
    public static  long countBinary(int n){
        long oldZeros = 1;
        long oldOnes = 1;

        for(int i= 2; i< n+1; i++){
            long newZero = oldOnes;
            long newOnes = oldOnes + oldZeros;

            oldZeros = newZero;
            oldOnes = newOnes;
        }

        return (oldOnes + oldZeros) *(oldOnes + oldZeros);
    }
}
