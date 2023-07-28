import java.util.Scanner;
public class Java_userinp_scanner {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter only number: ");
        int number = input.nextInt();
        System.out.println("You have entered number: "+number);
        System.out.println("user input number completed");

        String mystring = input.next();
        System.out.println("you have entered the string " + mystring);
        input.close();
    }
}
