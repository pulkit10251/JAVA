package STRING;

public class Q7 {

    public static void main(String[] args) {
        int N = 2;
        System.out.println(countAndSay(N));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        if (n == 2) {
            return "11";
        }

        String str = "11";

        for (int i = 3; i <= n; i++) {

            str += "$";

            int len = str.length();

            int count = 1;
            String temp = "";

            char[] arr = str.toCharArray();

            for (int j = 1; j < len; j++) {
                if (arr[j] != arr[j - 1]) {
                    temp += count ;

                    temp += arr[j - 1];

                    count = 1;
                } else {
                    count++;
                }

            }
            str = temp;
        }
        return str;
    }
}
