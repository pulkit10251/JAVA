package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q6 {

    public static void main(String[] args) {

        // Ques 6 : Union and Intersection of two set
        Integer[] sortedA = {10, 20, 30, 40, 50, 60};
        Integer[] sortedB = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};

        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.asList(sortedA));
        set.addAll(Arrays.asList(sortedB));

        HashSet<Integer> set1 =new HashSet<>(set);
        set1.retainAll(Arrays.asList(sortedA));
        Object[] arr = set.toArray();
        System.out.println(set1);
    }
    public static ArrayList<Integer> Union(int[] sortedA, int[] sortedB){
        ArrayList<Integer> Union = new ArrayList<Integer>();

        for (int i = 0; i < sortedA.length; i++) {
            for (int j = 0; j <sortedB.length; j++) {

            }
        }

        return Union;
    }

}
