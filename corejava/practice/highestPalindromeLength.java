package practice;
import java.util.HashSet;
public class highestPalindromeLength {
    public static int palinLength(String str){
        int output_len=0;
        HashSet<Character> palinCharacters = new HashSet<>();
        //abccccdd
        for(int i =0;i<str.length();i++){
            if(palinCharacters.contains(str.charAt(i))){
                palinCharacters.remove(str.charAt(i));
                output_len=output_len+2;
            } 
            else{
                palinCharacters.add(str.charAt(i));
            }
        }
        if(palinCharacters.size()>0){
            output_len=output_len+1;
        }
        //|abfgrgh| |--|
        return output_len;
    }
    public static void main(String[] args){
        String s = "abccccdd";
        int output = palinLength(s);
        System.out.println(output);

    }
}
//ccdadcc