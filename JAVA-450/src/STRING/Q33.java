package STRING;

import java.util.HashMap;

public class Q33 {

    public static void main(String[] args) {
        System.out.println(smallestWindow("aabcbcdcba"));
    }

    public static String smallestWindow(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, 0);
        }
        int i = 0;
        int j = 1;
        int count = 0;


        map.put(str.charAt(i), 1);
        count++;

        int ans = Integer.MAX_VALUE;
        while (i <= j && j < str.length()) {
            if (count < map.size()) {
                if (map.get(str.charAt(j)) == 0)
                    count++;
                map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
                j++;
            } else if (count == map.size()) {
                ans = Math.min(ans, j - i);

                if (map.get(str.charAt(i)) == 1) {
                    count--;
                }

                int val = map.get(str.charAt(i));
                map.put(str.charAt(i), val - 1);
                i++;


            }
        }
        while (count == map.size()) {
            ans = Math.min(ans, j - i);

            if (map.get(str.charAt(i)) == 1) {
                count--;
            }

            int val = map.get(str.charAt(i));
            map.put(str.charAt(i), val - 1);
            i++;
        }


        return str.substring(j-ans, j);
    }
}
