import java.util.Scanner;
public class Java_terinary_loop {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = obj.nextInt();
        System.out.println("Enter Number2");
        int num2 = obj.nextInt();
        System.out.println("Enter Number3");
        int num3 = obj.nextInt();
        int result = (num1>=num2)?((num1>=num3)?num1:num3):((num2>=num3)?num2:num3);
        System.out.println(result + " is the largest number");
        obj.close();
    }
}
