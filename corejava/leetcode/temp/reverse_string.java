package leetcode.temp;

public class reverse_string {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','m'};
        int start = 0;
        int end = s.length-1;
        char temp;
        while(start<end){
            temp=s[end];
            s[end]=s[start];
            s[start]=temp;
            start++;
            end--;
        }
        System.out.println(new String(s));
    }
}
/*
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */
