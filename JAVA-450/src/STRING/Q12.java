package STRING;

public class Q12 {

    public static void main(String[] args) {
        System.out.println(maxSubStr("0100110101"));
    }

    public static int maxSubStr(String str){

        int count0 = 0;
        int count1 = 0;

        int cnt = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == '0'){
                count0++;
            }

            if(str.charAt(i) == '1'){
                count1 ++;
            }

            if(count0 == count1){
                cnt++;
            }
        }
        if(count0 != count1){
            return -1;
        }
        return cnt;
    }
}
