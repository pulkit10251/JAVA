package STRING;

import java.util.Arrays;

public class Q24 {

    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'a', 'e', 'b', 'e', 'e', 'e', 'c', 'c'},
                {'a', 'b', 'e', 'c', 'b', 'd', 'e', 'c', 'a', 'd'},
                {'e', 'c', 'c', 'c', 'c', 'a', 'd', 'a', 'c', 'b'},
                {'e', 'e', 'a', 'd', 'd', 'd', 'c', 'b', 'b', 'b'},
                {'b', 'd', 'b', 'a', 'c', 'a', 'b', 'b', 'd', 'd'},
                {'c', 'c', 'c', 'd', 'a', 'e', 'a', 'c', 'e', 'b'}};
        String word = "bed";

        int[][] Ans = searchWord(grid, word);

        for (int i = 0; i < Ans.length; i++) {
            for (int j = 0; j < Ans[0].length; j++) {
                System.out.print(Ans[i][j]);
            }
            System.out.println();
        }

        if(Ans.length == 0){
            System.out.println(-1);
        }
    }

        public static int[][] searchWord ( char[][] input, String word){
            int[][] Ans = new int[100][2];

            for (int[] A : Ans) {
                Arrays.fill(A, -1);
            }
            int count = 0;
            int l = input.length;
            int w = input[0].length;
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[0].length; j++) {

                    if (input[i][j] == word.charAt(0)) {

                        if (j >= word.length() - 1 && searchLeft(input, word, i, j)) {
                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (w - j >= word.length() && searchRight(input, word, i, j)) {
                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (i >= word.length() - 1 && searchTop(input, word, i, j)) {

                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (l - i >= word.length() && searchBottom(input, word, i, j)) {

                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (i >= word.length() - 1 && j > word.length() - 1 && searchTopLeftDiagnol(input, word, i, j)) {

                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (l - i >= word.length() && j >= word.length() - 1 && searchBottomLeftDiagnol(input, word, i, j)) {

                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }
                        if (i >= word.length() - 1 && w - j >= word.length() && searchTopRightDiagnol(input, word, i, j)) {

                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                        if (l - i >= word.length() && w - j >= word.length() && searchBottomRightDiagnol(input, word, i, j)) {
                            Ans[count][0] = i;
                            Ans[count][1] = j;
                            count++;
                        }

                    }
                }
            }
            System.out.println(count);

            int[][] result = new int[count][2];

            for (int i = 0; i < result.length; i++) {
                result[i][0] = Ans[i][0];
                result[i][1] = Ans[i][1];
            }

            return result;
        }


        public static boolean searchLeft ( char[][] input, String word,int i, int j){
            for (int k = j, l = 0; k >= j - word.length() + 1; k--, l++) {
                if (input[i][k] != word.charAt(l)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean searchRight ( char[][] input, String word,int i, int j){
            for (int k = j, l = 0; k < j + word.length(); k++, l++) {
                if (input[i][k] != word.charAt(l)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean searchTop ( char[][] input, String word,int i, int j){
            for (int k = i, l = 0; k >= i - word.length() + 1; k--, l++) {
                if (input[k][j] != word.charAt(l)) {
                    return false;
                }
            }

            return true;

        }

        public static boolean searchBottom ( char[][] input, String word,int i, int j){

            for (int k = i, l = 0; k < i + word.length(); k++, l++) {
                if (input[k][j] != word.charAt(l)) {
                    return false;
                }
            }
            return true;

        }

        public static boolean searchTopRightDiagnol ( char[][] input, String word,int i, int j){

            for (int k = i, m = j, l = 0; k >= i - word.length() + 1; k--, m++, l++) {
                if (input[k][m] != word.charAt(l)) {
                    return false;
                }
            }
            return true;

        }

        public static boolean searchTopLeftDiagnol ( char[][] input, String word,int i, int j){
            for (int k = i, m = j, l = 0; k >= i - word.length() + 1; k--, m--, l++) {
                if (input[k][m] != word.charAt(l)) {
                    return false;
                }
            }
            return true;

        }

        public static boolean searchBottomLeftDiagnol ( char[][] input, String word,int i, int j){

            for (int k = i, m = j, l = 0; k < i + word.length(); k++, m--, l++) {
                if (input[k][m] != word.charAt(l)) {
                    return false;
                }
            }
            return true;

        }

        public static boolean searchBottomRightDiagnol ( char[][] input, String word,int i, int j){

            for (int k = i, m = j, l = 0; k < i + word.length(); k++, m++, l++) {
                if (input[k][m] != word.charAt(l)) {
                    return false;
                }
            }
            return true;

        }


    }
