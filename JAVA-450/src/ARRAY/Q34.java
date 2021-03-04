package ARRAY;

public class Q34 {

    public static void main(String[] args) {
        int[] A = {111, 212, 313, 425};
        System.out.println(PalindromeArray(A, A.length));
    }

    public static int PalindromeArray(int[] A, int n) {
        for (int val : A) {
            if (!isPalindrome(val)) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int num = 0;
        while (temp > 0) {
            int rem = temp % 10;
            num = num * 10 + rem;
            temp /= 10;
        }

        if (num == n) {
            return true;
        }
        return false;
    }
}
