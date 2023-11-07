package corejava.leetcode.strings;

public class len_last_word {
    // abc ''''
        // abc
        int counter = 0;
        int act_s_pos = 0;
        for(int s_len = s.length()-1;s_len>0;s_len--){
            if(s.charAt(s_len) == ' '){
                act_s_pos = s_len-1;
            }
            else{
                act_s_pos = s_len;
                break;
            }
        }
        while(act_s_pos>=0 && s.charAt(act_s_pos)!= ' '){
            counter++;
            act_s_pos--;
        }
        return counter;
    }
}
/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

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

Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 
 */