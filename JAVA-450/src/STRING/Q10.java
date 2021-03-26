package STRING;

public class Q10 {

    public static void main(String[] args) {
        String output = "";
        String input = "abcd";

        printSubsequence(input, output);
    }

    public static void printSubsequence(String input, String Output){

        if (input.isEmpty()){
            System.out.println(Output);
            return;
        }

        printSubsequence(input.substring(1), Output+ input.charAt(0));

        printSubsequence(input.substring(1), Output);

    }
}
