import java.util.Scanner;
public class Java_sumofgivenint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter big number to get some of them:");
        int number=input.nextInt();
        System.out.println("sum of all digits in number " + number + " is:");
        int rem,result=0;
        do{
            rem=number%10;
            result=result+rem;
            number/=10;
        }
        while(number!=0);
        System.out.println(result);
    }
}
