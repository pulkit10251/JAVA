package STRING;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    public static void main(String[] args) {
        String str = "GEEKS_FOR_GEEKS";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            if(map.get(arr[i])!= null){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Character, Integer> ele : map.entrySet()) {
            if(ele.getValue() > 1){
                System.out.print(ele.getKey()+"  ");
            }
        }
    }
}
