package ARRAY;

import java.util.HashMap;
import java.util.Map;

public class Q25 {

    public static void main(String[] args) {
        //Ques 25 : Given an array of size n and a number k, find all elements that appear more than n/k times.
        int[] A = {3, 1, 2, 2, 2, 1, 4, 3, 3};
        int k = 4;
        int n = A.length;
        int NbyK = n / k;
        countNbyK(A,NbyK);

    }

    public static void countNbyK(int[] A, int NbyK) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : A
        ) {
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                map.put(val, map.get(val) + 1);
            }
        }
        for(Map.Entry m : map.entrySet()){
            Integer temp = (Integer) m.getValue();
            if(temp > NbyK){
                System.out.println(m.getKey());
            }
        }
    }
}
