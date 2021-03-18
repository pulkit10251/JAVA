package STRING;

public class Q2 {

    public static void main(String[] args) {
        String st = "ababab";

        StringBuilder sb = new StringBuilder(st);
        String rev = sb.reverse().toString();
        if(st.equals(rev)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }
    }
}
