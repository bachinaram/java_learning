import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeLength {
    public static int longestPalindrome(String s) {
        // Count occurrences of each character
        int output =0;
        if(s.length()<=1){
            return 1;
        }
        
        else{
            HashMap<Character, Integer> inp = new HashMap<>();
            Character c = null;
            
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                if(inp.containsKey(c)){
                    inp.put(c,inp.get(c)+1);
                }
                else{
                    inp.put(c,1);
                }
            }

            int one =0;
            for(Map.Entry<Character, Integer> element : inp.entrySet()){
                int temp = element.getValue();
                if(inp.size() == 1){
                    return temp;
                }
                else if(temp%2 == 0){
                    output = output + temp;
                }
                else if(temp ==1 ){
                    one = one + temp;
                }
                else{
                    output = temp - 1;
                }
            }
            if(one >= 1){
                output = output + 1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abccccdd";
        int result = longestPalindrome(input);
        System.out.println("Length of the longest palindrome: " + result);
    }
}