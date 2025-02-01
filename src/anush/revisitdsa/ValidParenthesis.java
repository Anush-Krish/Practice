package anush.revisitdsa;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String str) {
        Stack<Character> arr =new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.length() % 2 !=0){
                return false;
            }
            if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='['){
                arr.push(str.charAt(i));
            }else if(arr.isEmpty()){
                return false;
            }else if(arr.peek() == '(' &&str.charAt(i)==')'){
                arr.pop();
            }else if(arr.peek() == '{' &&str.charAt(i)=='}'){
                arr.pop();
            }else if(arr.peek() == '[' &&str.charAt(i)==']'){
                arr.pop();
            }else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
                arr.push(str.charAt(i));
            }
        }
        return arr.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("([}}])"));
    }
}
