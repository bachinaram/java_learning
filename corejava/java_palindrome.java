public class java_palindrome {
    public static boolean validPalin(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char start_ch = s.charAt(start);
            char end_ch = s.charAt(end);
            if(!Character.isLetterOrDigit(start_ch)){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(end_ch)){
                end--;
                continue;
            }
            if(Character.toLowerCase(start_ch) != Character.toLowerCase(end_ch)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s ="Race  car$";
        System.out.println("Given palindrome string "+s+" "+validPalin(s));
    } 
}
