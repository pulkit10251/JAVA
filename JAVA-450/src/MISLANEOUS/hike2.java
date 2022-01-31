package MISLANEOUS;

public class hike2 {
    public static void main(String[] args) {
        int n = 6;
        int[] a = {-1,0,1,1,2,4};

        int q = 2;
        int[] s = {5,4};
        int[] l = {1,2};
        for(int i = 0; i < q; i++){
            int sum = 0;
            sum = sum + s[i];
            int currIndex = s[i];
            int temp = 0;
            while(currIndex >= 0){
                temp = l[i];
                while(currIndex >= 0 && temp >0 ){
                    int ni = a[currIndex];
                    currIndex = ni;
                    temp--;
                }
                if(currIndex >= 0) {
                    sum += currIndex;
                }
            }
            System.out.println(sum);
        }

    }
}
