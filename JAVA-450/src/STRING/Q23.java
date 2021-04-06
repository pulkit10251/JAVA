package STRING;

import java.nio.charset.StandardCharsets;

public class Q23 {

    public static void main(String[] args) {
        char[][] input = {
                {'B','B','M','B','B','B'},
                {'C','B','A','B','B','B'},
                {'I','B','G','B','B','B'},
                {'G','B','I','B','B','B'},
                {'A','B','C','B','B','B'},
                {'M','C','I','G','A','M'}
        };
        String word = "MAGIC";

        System.out.println(countStrings(input,word));
    }

    public static int countStrings(char[][] input, String word) {
        int count = 0;
        int l = input.length;
        int w = input[0].length;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {

                if (input[i][j] == word.charAt(0)) {
                    System.out.println(i+"   "+j);
                    if(j >= word.length()-1&& searchLeft(input,word,i,j)){
                        count++;
                    }

                    if(w - j >= word.length() && searchRight(input,word,i,j)){

                        count++;
                    }

                    if(i>= word.length()-1 && searchTop(input,word,i,j)){

                        count++;
                    }

                    if(l-i >= word.length() && searchBottom(input,word,i,j)){

                        count++;
                    }

                }
            }
        }

        return count;
    }


    public static boolean searchLeft(char[][] input, String word, int i ,int j){
        for (int k = j ,l=0; k>= j-word.length()+1;k--,l++){
            if(input[i][k] != word.charAt(l)){
                return false;
            }
        }
        return true;
    }

    public static boolean searchRight(char[][] input, String word, int i ,int j){
        for (int k = j,l=0; k < j + word.length() ; k++, l++) {
            if(input[i][k] != word.charAt(l) ){
                return false;
            }
        }
        return true;
    }

    public static boolean searchTop(char[][] input, String word, int i ,int j){
        for (int k = i ,l=0; k>= i-word.length()+1;k--,l++){
            if(input[k][j] != word.charAt(l)){
                return false;
            }
        }

        return true;

    }

    public static boolean searchBottom(char[][] input, String word, int i ,int j){

        for (int k = i,l=0; k < i + word.length() ; k++, l++) {
            if(input[k][j] != word.charAt(l) ){
                return false;
            }
        }
        return true;

    }

}
