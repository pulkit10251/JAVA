package STRING;

import java.util.Stack;

public class Q16 {

    public static void main(String[] args) {
        System.out.println(BalancedParenthesis("{{[()]}}}"));
    }

    public static boolean BalancedParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        if(str.charAt(0) == '}' || str.charAt(0) == ']' || str.charAt(0)==')'){
            return false;
        }
        for (int i = 0 ; i< str.length(); i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else

            if(str.charAt(i) == '}' && !stack.isEmpty() &&  stack.peek() =='{'){
                stack.pop();
            }else if(str.charAt(i) == ')' && !stack.isEmpty() &&  stack.peek() =='('){
                stack.pop();
            }else if(str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() =='['){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
