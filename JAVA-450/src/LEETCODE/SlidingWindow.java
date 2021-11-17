package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidboaoo";
        boolean ans = findAnagrams(s2,s1);
        System.out.println(ans);
    }
    public static boolean findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        int keyCount = map.size();
        int i = 0, j= 0;
        int k = p.length();
        int n = s.length();

        while(j < n){
            if(map.containsKey(s.charAt(j))){
                int newCount = map.get(s.charAt(j)) -1;
                map.put(s.charAt(j), newCount);
                if(newCount == 0){
                    keyCount --;
                }
            }
            if(j - i +1 < k){
                j++;
            }else{
                if(keyCount == 0){
                    return true;
//                    list.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                    int count = map.get(s.charAt(i))+1;
                    map.put(s.charAt(i), count);
                    if(count == 1){
                        keyCount++;
                    }
                }
                i++;
                j++;
            }
        }
        return false;


    }
}
