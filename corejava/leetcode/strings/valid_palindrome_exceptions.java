package leetcode.strings;

public class valid_palindrome_exceptions {
    public static boolean isValid(String s){
        //String s = s1.toLowerCase();
        if(s.isEmpty()){
            return true;
        }
        int first = 0;
        int last = s.length()-1;
        while(first<=last){
            char begin_char = s.charAt(first);
            char end_char = s.charAt(last);


            if(!Character.isLetterOrDigit(begin_char)){
                first++;
            }
            else if(!Character.isLetterOrDigit(end_char)){
                last--;
            }
            else if(Character.toLowerCase(begin_char) != Character.toLowerCase(end_char)){
                return false;
            }
            else{
                first++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        //String s=";Race a car: ";
        //String s = "Racecar    ";
        String s = "0P";
        System.out.println("result is: " + isValid(s));
    }
}


//string can have the both numbers and characters
/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 
 */