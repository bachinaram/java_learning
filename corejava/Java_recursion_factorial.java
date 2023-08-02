import java.util.Scanner;
public class Java_recursion_factorial {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int number = obj.nextInt();
        factorial(number,number);
        obj.close();
    }
    public static void factorial(int n, int total){
        if(n>1){
            n--;
            total = total * n;
            factorial(n,total);
        }
        else if(n==0){
            System.out.println(1);
        }
        else{
            System.out.println(total);
        }
    }
}
