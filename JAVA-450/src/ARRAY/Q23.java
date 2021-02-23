package ARRAY;

public class Q23 {

    public static void main(String[] args) {
        //Ques 23 : Maximum product sub Array
        int[] A = {6, -3, -5,0, 5, 2};

        int curr_max_Product = 1;
        int curr_min_Product = 1;
        int ans = 1;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0){
                curr_max_Product = 1;
                curr_min_Product = 1;
                continue;
            }
            int temp = curr_max_Product * A[i];
            curr_max_Product = Math.max(Math.max(curr_max_Product * A[i], curr_min_Product * A[i]), A[i]);
            curr_min_Product = Math.min(Math.min(temp, curr_min_Product * A[i]), A[i]);
            ans = Math.max(Math.max(curr_max_Product, curr_min_Product),ans);

        }
        System.out.println(ans);
    }
}
