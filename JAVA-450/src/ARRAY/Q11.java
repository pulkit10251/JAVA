package ARRAY;

public class Q11 {

    public static void main(String[] args) {
        int[] A = {1,2,3,3};
        int ans=0;
        for (int i = 0; i < A.length; i++) {
            int ele = A[i];
            for (int j = i+1; j < A.length; j++) {
                if(A[j]==ele){
                    ans = ele;
                    break;
                }

            }
        }
        System.out.println(ans);

    }
}
