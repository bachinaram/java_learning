import java.util.HashSet;


public class LongestPalindromeLength {
    public static int longestPalindrome(String s) {
        int output =0;
        HashSet<Character> myset = new HashSet();
        for(char c:s.toCharArray()){
            if(myset.contains(c)){
                output = output + 2;
                myset.remove(c);
            }
            else{
                myset.add(c);
            }
        }
        if(myset.size()>0){
            output = output + 1;
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


/* Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

 */

