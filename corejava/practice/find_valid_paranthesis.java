package practice;
import java.util.Stack;
public class find_valid_paranthesis {
    public static boolean validParanthesis(String s){
        boolean output=false;
        Stack<Character> braces = new Stack();
        //"{[[(({}))]]}" --->['{','[','[',..............]
        for(char ch:s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                braces.push(ch);
            }
            else if(ch == '}' && !braces.isEmpty() && braces.peek() == '{'){
                braces.pop();
            }
            else if(ch == ')' && !braces.isEmpty() && braces.peek() == '('){
                braces.pop();
            }
            else if(ch == ']' && !braces.isEmpty() && braces.peek() == '['){
                braces.pop();
            }
            else{
                return false;
            }
        }
        if(braces.empty()){
            output = true;
        }
        else{
            output = false;
        }
        return output;
    }
    public static void main(String[] args){
        String s = "{}";
        boolean result = validParanthesis(s);
        System.out.println(result);
    }
}
