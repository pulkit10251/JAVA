package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] A = {1,56,54,8,5,9,53,45};
        int k = 4;
        String MaxORMin ="max";
        System.out.println(k+"th "+MaxORMin+" element is "+kthMaxMin(A,k,MaxORMin));

    }
    
    public static int kthMaxMin(int[] A, int k, String MaxORMin){

        Arrays.sort(A);
        int val;
        if(MaxORMin.equals("max")){
            val = A[A.length-k];
        }else{
            val = A[k-1];
        }

        return  val;
    }
}
