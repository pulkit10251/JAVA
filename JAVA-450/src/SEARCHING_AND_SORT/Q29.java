package SEARCHING_AND_SORT;

public class Q29 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "  " + findNum(i));
        }
    }

    public static int findNum(int n){

        if(n == 1) {
            return 5;
        }
        int lo = 0;
        int hi = 5*n;

        while(lo < hi){
            int mid = (lo + hi)/2;
            if(check(n,mid)){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }

        return lo;
    }

    public static boolean check(int n, int mid){
        int temp =mid;

        int f = 5, count = 0;

        while(f <= temp){
            count += temp / f;
            f = f*5;
        }

        return count>=n;
    }
}
