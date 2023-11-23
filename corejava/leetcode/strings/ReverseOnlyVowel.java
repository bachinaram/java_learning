package leetcode.strings;

public class ReverseOnlyVowel {
    public static void main(String[] args){
        //String s = "ho are things";
        String s ="leetcode";
        System.out.println(reverse_vowels(s));
    }
    public static String reverse_vowels(String s){
        int start = 0;
        int end = s.length()-1;
        char[] ch_ary = s.toCharArray();
        char temp;
        while(start<end){
            if(isVowel(ch_ary[start]) && isVowel(ch_ary[end])){
                temp=ch_ary[end];
                ch_ary[end]=ch_ary[start];
                ch_ary[start]=temp;
                start++;
                end--;
            }
            else if(!isVowel(ch_ary[start])){
                start++;
            }
            else{
                end--;
            }
        }
        return new String(ch_ary);
    }

    public static boolean isVowel(char ch){
        String vowel = "aeioiuAEIOU";
        int result = vowel.indexOf(ch);
        boolean out;
        if(result != -1){
            out = true;
        }
        else{
            out = false;
        }
        return out;
        //return "aeiouAEIOU".indexOf(ch)!=-1;

    }
}

/*
 * 
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"

 

Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.
 */