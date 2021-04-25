package SEARCHING_AND_SORT;

public class InfyQ1 {

    public static void main(String[] args) {
        int[] array = {90, 95, 96, 92, 94};

        System.out.println(first(array));
    }

    public static int first(int[] arr) {

        int min = 101;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        String minMarks = String.valueOf(min);
        char[] marks = minMarks.toCharArray();
        if (marks[0] != '9') {
            marks[0] = '9';
        } else {
            marks[1] = '9';
        }

        int newMarks = Integer.parseInt(new String(marks));

        return sum - min + newMarks;
    }
}
