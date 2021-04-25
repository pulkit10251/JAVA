package SEARCHING_AND_SORT;

public class Q28 {

    public static void main(String[] args) {
        System.out.println(inSequence(1,5,4));
    }
    public static int inSequence(int A, int B, int C){
        // code here

        if(C == 0 && A == B){
            return 1;
        } else if(C > 0 && B >= A){
            if((B-A)%C == 0){
                return 1;
            }
        }else if(C < 0 && A >= B){
            if((A-B)%C == 0){
                return 1;
            }
        }

        return 0;

    }

}
