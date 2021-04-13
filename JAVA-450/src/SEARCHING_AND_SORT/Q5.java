package SEARCHING_AND_SORT;

public class Q5 {

    public static void main(String[] args) {
        System.out.println(middle(20,50,10));
    }

    public static int middle(int A, int B, int C){
      if(A > B && A < C || A<B && A > C){
          return A;
      }else if(B > A && B < C || B<A && B> C){
          return B;
      }else{
          return C;
      }
    }
}
