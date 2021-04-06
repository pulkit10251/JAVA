package STRING;

import java.util.HashMap;
import java.util.Map;

public class Q29 {

    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secondMost(str, 6));
    }

    public static String secondMost(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.merge(str, 1, Integer::sum);
        }
        int first = Integer.MIN_VALUE;

        int second = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            int v = entry.getValue();
            if(v > first){
                second = first;
                first = v;
            }else if(v > second && v != first){
                second = v;
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == second){
                return entry.getKey();
            }
        }

        return null;
    }
}
