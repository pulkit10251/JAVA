package STRING;

import java.util.HashMap;

public class Q37 {

    public static void main(String[] args) {

        System.out.println(smallestWindow("this is a test string", "tist"));
    }

    public static String smallestWindow(String str, String pat) {
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char ch : pat.toCharArray()) {
            map1.merge(ch, 1, Integer::sum);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        int i = 0;
        int j = 0;
        int count = 0;
        String ans = "";

        while (i <= j && j < str.length()) {
            if (count < map1.size()) {
                char ch = str.charAt(j);

                if(map1.containsKey(ch)){
                    map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                    if (map2.get(ch) == map1.get(ch)) {
                        count++;
                    }
                }

                j++;

            } else if (count == map1.size()) {
                String temp = str.substring(i,j);
                if(ans.length()==0 ||temp.length() < ans.length()){
                    ans = temp;
                }

                char ch = str.charAt(i);
                if (map2.containsKey(ch))
                    if (map2.get(ch) == 1) {
                        map2.remove(ch);
                    } else {
                        map2.put(ch, map2.get(ch) - 1);
                    }

                if (map2.getOrDefault(ch, 0) < map1.getOrDefault(ch, 0)) {
                    count--;
                }
                i++;
            }
        }
        while(count == map1.size()) {
            String temp = str.substring(i,j);
            if(ans.length()==0 ||temp.length() < ans.length()){
                ans = temp;
            }

            char ch = str.charAt(i);
            if (map2.containsKey(ch))
                if (map2.get(ch) == 1) {
                    map2.remove(ch);
                } else {
                    map2.put(ch, map2.get(ch) - 1);
                }

            if (map2.getOrDefault(ch, 0) < map1.getOrDefault(ch, 0)) {
                count--;
            }
            i++;
        }

        return ans;
    }
}
