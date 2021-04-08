package STRING;

public class Q38 {

    public static void main(String[] args) {
        String ans = recursiveRemove("geeksforgeeks");
        System.out.println(ans);
    }

    public static String recursiveRemove(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.substring(0,1).equals(str.substring(1,2))) {
            return recursiveRemove(str.substring(0, 1) + str.substring(2));
        }
        else {
            return str.charAt(0) + recursiveRemove(str.substring(1));
        }

    }
}
