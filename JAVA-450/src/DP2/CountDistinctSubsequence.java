package DP2;

import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n ; i++) {
            char ch = str.charAt(i-1);
            dp[i] = 2*dp[i-1];
            if(map.containsKey(ch)){
                int index = map.get(ch);
                dp[i] -= dp[index-1];
            }
            map.put(ch, i);
        }

        System.out.println(dp[n]);

    }
}
