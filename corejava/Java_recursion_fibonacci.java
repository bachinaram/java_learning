import java.util.Scanner;
public class Java_recursion_fibonacci {
    public static void main(String args[]){
        System.out.print("Which fibonacci element you need: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fib(n));
        obj.close();
    }
    public static int fib(int a){
        if(a==0 || a==1){
            return 0;
        }
        else if(a==2){
            return 1;
        }
        return fib(a-1)+fib(a-2);
        //54321
    }
}
