package ARRAY;

public class Q23 {

    public static void main(String[] args) {
        //Ques 23 : Maximum product sub Array
        int[] A = {-2,0,-1};

        int curr_max_Product = A[0];
        int curr_min_Product = A[0];
        int ans = A[0];

        for (int i = 1; i < A.length; i++) {
            int temp = curr_max_Product * A[i];
            curr_max_Product = Math.max(Math.max(curr_max_Product * A[i], curr_min_Product * A[i]), A[i]);
            curr_min_Product = Math.min(Math.min(temp, curr_min_Product * A[i]), A[i]);
            ans = Math.max(curr_max_Product,ans);

        }
        System.out.println(ans);
    }
}
