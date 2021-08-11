package GREEDY;

public class MaximumSumNonAdjacent {
    public static void main(String[] args) {
        int[] arr = {5,10,10,100,5,6};
        System.out.println(maximumSumNonAdjacent(arr));
    }

    public static  int maximumSumNonAdjacent(int[] arr){
        int inc = arr[0];
        int exc = 0;

        for (int i = 1; i < arr.length; i++) {
            int ninc = exc + arr[i];
            int nexc = Math.max(inc, exc);

            inc = ninc;
            exc = nexc;
        }

        return Math.max(inc, exc);
    }
}
