import java.util.Arrays;

public class longest_common_prefix {
     public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        String begin = strs[0];
        String end = strs[strs.length-1];
        // flower flow abber abberant case
        // 0     1      2       3       4
        for(int i=0;i<Math.min(begin.length(),end.length());i++){
            //int minLength = Math.min(strs[begin].length(),strs[end].length);
            if(begin.charAt(i)!=end.charAt(i)){
                return result.toString();
            }
            result.append(begin.charAt(i));
        }
        return result.toString();
    }
}
/*
 * 
 */