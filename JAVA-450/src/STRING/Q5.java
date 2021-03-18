package STRING;

public class Q5 {

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");

    }
    public static boolean areRotations(String str1, String str2){
        if(str1.length() == str2.length()){
            if((str1 + str1).contains(str2)){
                return true;
            }
        }
        return false;
    }
}
