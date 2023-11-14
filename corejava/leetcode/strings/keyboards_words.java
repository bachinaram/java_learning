package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class keyboards_words {
   public static String[] findWords(String[] words) {
        String[] keyboardRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            for (String row : keyboardRows) {
                boolean containsAllLetters = true;

                for (char c : lowercaseWord.toCharArray()) {
                    if (row.indexOf(c) == -1) {
                        containsAllLetters = false;
                        break;
                    }
                }

                if (containsAllLetters) {
                    result.add(word);
                    break;
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] singleRowWords = findWords(words);

        System.out.println("Words that can be typed using letters of one row: " + Arrays.toString(singleRowWords));
    }
}