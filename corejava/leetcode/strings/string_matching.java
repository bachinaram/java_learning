package leetcode.strings;

import java.util.Arrays;

public class string_matching {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        boolean output = stringCheck(s,t);
        System.out.println("Two string comparision is: "+output);
    }
    /*
     *     private static boolean stringCheck(String s, String t){
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        String str1 = new String(s_array);
        String str2 = new String(t_array);
        return str1.equals(str2);
    }
     */

    private static boolean stringCheck(String s, String t){
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        if(s_array.length!=t_array.length){
            return false;
        }
        else{
            for(int i=0;i<s_array.length;i++){
                if(s_array[i]!=t_array[i]){
                    return false;
                }
            }
        }
        return true;
    }
     
    
}
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

 

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.


 */