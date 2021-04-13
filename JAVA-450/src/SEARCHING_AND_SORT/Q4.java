package SEARCHING_AND_SORT;

public class Q4 {

    public static void main(String[] args) {
        System.out.println(count_squares(100));
    }
    public static int count_squares(int N){

        return (int)Math.sqrt(N - 1);
    }
}
