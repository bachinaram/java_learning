package leetcode.temp;

import java.util.ArrayList;

public class querty_words {
    public static ArrayList<String> findRowWoStrings(String[] words){
        ArrayList<String> output = new ArrayList<>();
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for(String word: words){
            
            for(String row: rows){
                boolean wordexists=true;
                for(char ch:word.toCharArray()){
                    if(row.indexOf(ch)== -1){
                        wordexists = false;
                        break;
                    }
                }
                if(wordexists){
                    output.add(word);
                    break;
                }
            }
                
        }
        return output;
    }
    public static void main(String[] args){
        String[] words = {"hello" , "poor", "fags"};
        ArrayList<String> output = findRowWoStrings(words);
        for(String word:words){
            System.out.println(word);
        }
    }
}
