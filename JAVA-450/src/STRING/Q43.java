package STRING;

public class Q43 {

    public static void main(String[] args) {
        String[][] arr = {{"you", "we", ""},
                {"have", "are", ""},
                {"sleep", "eat", "drink"}};
        print(arr);
    }

    public static void print(String[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        String[] output = new String[R];

        for (int i = 0; i < C; i++)
            if (arr[0][i] != "")
                printUtil(arr, 0, i, output);
    }

    static void printUtil(String[][] arr,
                          int m, int n,
                          String[] output) {
        // Add current word to output array
        int R = arr.length;
        int C = arr[0].length;
        output[m] = arr[m][n];

        // If this is last word of
        // current output sentence,
        // then print the output sentence
        if (m == R - 1) {
            for (int i = 0; i < R; i++)
                System.out.print(output[i] + " ");
            System.out.println();
            return;
        }

        // Recur for next row
        for (int i = 0; i < C; i++)
            if (arr[m + 1][i] != "" && m < C)
                printUtil(arr, m + 1, i, output);
    }


}
