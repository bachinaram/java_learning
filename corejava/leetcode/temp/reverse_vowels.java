package leetcode.temp;

public class reverse_vowels {
    public static String vowelReverse(String str){
        char[] str1 = str.toCharArray();
        int start = 0;
        int end = str1.length-1;
        char temp;
        while(start<end){
            if(isVowel(str1[start]) && isVowel(str1[end])){
                temp = str1[end];
                str1[end]=str1[start];
                str1[start]=temp;
                start++;
                end--;
            }
            else if(!isVowel(str1[start])){
                start++;
            }
            else{
                end--;
            }
        }
        return new String(str1);
    }

    public static boolean isVowel(char c){
       return "aeiou".indexOf(c)!=-1;
    }
    public static void main(String[] main){
        String s ="how are things";
        String output  = vowelReverse(s);
        System.out.println(output);
    }
}
