package practice;
import java.lang.String;
public class binary_addition {
    public static void main(String[] args){
        String a = "10";
        String b =  "1111";
        int carry =0;
        int s1 = a.length()-1;
        int s2 = b.length()-1;

        StringBuilder output = new StringBuilder();
        //   10 2
        // 1111 4
        while(s1>=0||s2>=0){

            int temp = carry;
            if(s1>=0 && s2>=0){
                temp = a.charAt(s1) - '0' + b.charAt(s2) - '0';
                
            }
            else if(s1>=0 && s2<0){
                temp = a.charAt(s1) - '0';
            }
            else{
                 temp = b.charAt(s2) - '0';
            }
            if(temp>1){
                carry = 1;
                output.append(0);
            }
            else{
                carry = 1;
                output.append(0);
            }
            s1--;
            s2--;
        }
        if(carry== 1){
            output.append(1);
        }
        System.out.println(output.reverse().toString()); 
    }
}
