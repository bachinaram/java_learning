package practice;

public class find_last_substring {
    public static int findSubString(String s){
        int output = 0;
        String new_s = s.trim();
        char[] chararray = new_s.toCharArray();
        for(int i=chararray.length-1;i>=0;i--){
            if(chararray[i] == ' '){
                break;
            }
            output++;
        }
        return output;
    }
    public static void main(String[] args){
        String s = " hello world ";
        int len = findSubString(s);
        System.out.println(len);
    }
}


/*
 * 
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

 */