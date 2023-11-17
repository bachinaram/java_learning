import java.util.Scanner;
public class Java_armstrong {
    public static void isArmstrong(int inp,int cnt){
        int rem;
        double res,output=0;
        //commenting for extra variable
        int comp_inp=inp;
        do{
            rem=inp%10;
            res=Math.pow(rem,cnt);
            output=output+res;
            inp=inp/10;
        }
        while(inp>0);
        int value = (int)output;
        
        if(comp_inp == value){
            System.out.println(comp_inp +" is a armstrong number");
        }
        else{
            System.out.println(comp_inp +" is not a armstrong number"); 
        }
    }
    public static int int_count(int sum){
        int cnt_res=0;
        while(sum>0){
            sum/=10;
            cnt_res++;
        }
        return cnt_res;
        //comment

    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to find armstrong number:");
        int input = obj.nextInt();
        int count = int_count(input);
        isArmstrong(input,count);
        obj.close();
        //System.out.println(count);
   } 
}
