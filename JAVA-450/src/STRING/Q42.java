package STRING;

import java.util.Arrays;

public class Q42 {

    public static void main(String[] args) {

    }

    public static boolean areIsomorphic(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int size = 256;

        if (m != n)
            return false;
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++) {

            if (map[str1.charAt(i)] == -1) {
                if (marked[str2.charAt(i)])
                    return false;
                marked[str2.charAt(i)] = true;
                map[str1.charAt(i)] = str2.charAt(i);
            } else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;

        }
        return true;
    }
}
