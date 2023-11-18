package practice;

public class valid_palindrome_string {
    public static boolean validPalin(String s){
        int start = 0;
        int end = s.length()-1;
        
        char[] charr = s.toCharArray();
        while(start<end){
            if(!Character.isLetterOrDigit(charr[start])){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(charr[end])){
                end--;
                continue;
            }
            if(Character.toLowerCase(charr[start])!=Character.toLowerCase(charr[end])){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "@Race $$ car@@ ";
        boolean b =validPalin(s);
        System.out.println(b);
    }
}


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