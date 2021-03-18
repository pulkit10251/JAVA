package STRING;

public class Q1 {

    public static void main(String[] args) {
        String s = "pulkit";
        // Method 1
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());

        // Method 2
        char[] arr = s.toCharArray();
        String ans = "";
        for(int i = arr.length-1; i>=0; i--){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
