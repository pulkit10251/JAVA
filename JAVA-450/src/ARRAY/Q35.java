package ARRAY;

import java.util.Arrays;

public class Q35 {

    public static void main(String[] args) {
        int[] A= {90,100,78,89,67};
        System.out.println(find_median(A));
    }

    public static int find_median(int[] v)
    {
        Arrays.sort(v);
        int mid = (v.length-1)/2;
        if(v.length % 2 == 0){
            return (v[mid] + v[mid+1])/2;
        }
        return v[mid];
    }
}
