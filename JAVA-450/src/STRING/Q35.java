package STRING;

public class Q35 {

    public static void main(String[] args) {
        System.out.println(addFront("abbcdbaaa"));
    }

    public static boolean isPalindrome(String str){
        StringBuilder stb = new StringBuilder(str);
        String rev = stb.reverse().toString();
        return str.equals(rev);
    }

    public static int addFront(String str){
        int count = 0;
        while(str.length() > 0){
            if(isPalindrome(str)){
                break;
            }else{
                count++;
                str = str.substring(0, str.length()-1);
            }
        }

        return count;
    }
}
