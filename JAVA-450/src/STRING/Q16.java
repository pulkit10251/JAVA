package STRING;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {

    public static void main(String[] args) {
        String[] B = { "i", "like", "sam", "sung", "samsung", "mobile",
                "ice","cream", "icecream", "man", "go", "mango" };

        ArrayList<String> li =  new ArrayList<>(Arrays.asList(B));
        String A = "ilikesamsung";

        System.out.println(WordWrap(A, li));

    }

    public static int WordWrap(String A, ArrayList<String> B) {
        int[] dp = new int[A.length()];


        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                String w2check = A.substring(j, i + 1);
                if (B.contains(w2check))
                    if (j > 0) {
                        dp[i] += dp[j - 1];
                    } else {
                        dp[i] += 1;
                    }
            }
        }

        return dp[A.length()-1];
    }
}
