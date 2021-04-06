package STRING;

import java.util.ArrayList;

public class Q30 {

    public static void main(String[] args) {
        System.out.println(swapCount("[]][]["));
    }

    public static int swapCount(String s) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                li.add(i);
            }
        }

        int count = 0;
        int p = 0;

        int sum = 0;

        char[] str = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if(str[i] == '['){
                count++;
                p++;
            }else{
                count--;
            }

            if(count < 0){
                sum += li.get(p) - i;
                char temp = str[i];
                str[i] = str[li.get(p)];
                str[li.get(p)] = temp;
                ++p;


                count =1;
            }


        }

        return  sum;
    }
}
