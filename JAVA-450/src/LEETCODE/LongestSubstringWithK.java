package LEETCODE;

import java.util.HashMap;

public class LongestSubstringWithK {
    public static void main(String[] args) {
        String str= "abababbdabcabc";
        int k = 2;
        System.out.println(longestSubstring(str, 2));
    }
    public static int longestSubstring(String s, int k) {
        int i = 0, j = 0;
        int len = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int freqGreaterthanK = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.get(s.charAt(j)) == k){
                freqGreaterthanK ++;
            }

            if(map.size() == freqGreaterthanK){
                len = Math.max(len, j - i + 1);
                j++;
            }else if(map.size() > freqGreaterthanK){

                while(map.size() > freqGreaterthanK){
                    int count = map.get(s.charAt(i));
                    map.put(s.charAt(i), count - 1);
                    if(count < k){
                        freqGreaterthanK --;
                    }else if(count == 0){
                        map.remove(s.charAt(i));
                    }
                    len = Math.max(len, j - i + 1);
                    i++;
                }

                j++;

            }

        }
        return len;
    }
}
