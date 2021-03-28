package STRING;

public class Q11 {

    public static void main(String[] args) {
        String str = "ABC";
        Permutations(str,0, str.length()-1);
        System.out.println(str);
    }

    public static void Permutations(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        }

        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            Permutations(str, l + 1, r);
            str = swap(str, l, i);

        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
