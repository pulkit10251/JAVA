package STRING;

import java.util.Stack;

public class Q21 {

    public static void main(String[] args) {
        System.out.println(countReversals("}{{}}{{{"));
    }

    public static int countReversals(String expr){
        int len = expr.length();

        if (len%2 != 0)
            return -1;

        Stack<Character> s=new Stack<>();

        for (int i=0; i<len; i++)
        {
            char c = expr.charAt(i);
            if (c =='}' && !s.empty())
            {
                if (s.peek()=='{')
                    s.pop();
                else
                    s.push(c);
            }
            else
                s.push(c);
        }

        int red_len = s.size();
        double open = 0.0;
        double close = 0.0;
        while (!s.empty() )
        {

            if(s.peek() == '{'){
                open++;
            }else{
                close++;
            }
            s.pop();
        }

        return (int)(Math.ceil(open / 2) + Math.ceil(close/2));
    }
}
