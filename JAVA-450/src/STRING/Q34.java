package STRING;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q34 {


    public static void main(String[] args) {
        rearrangeString("aaaaabbc");
    }

    public static void rearrangeString(String str){
        int n = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            map.merge(str.charAt(i),1, Integer::sum);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> val : map.entrySet()){
            if(val.getValue() > max){
                max = val.getValue();
            }
        }

        if(max <= n - max + 1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
