package STRING;

public class Q19 {

    public static void main(String[] args) {
        KMP("aaaa");
    }

    public static void KMP(String s){
        int M = s.length();

        int[] lps = new int[M];
        lps[0] = 0;


        int len = 0;

        int i = 1;
        while (i < M){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0 ){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        for (int val : lps){
            System.out.print(val+"  ");
        }
        System.out.println();

        int res = lps[M -1];
        System.out.println(Math.min(res, M /2));

    }
}
