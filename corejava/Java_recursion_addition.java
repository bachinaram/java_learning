import java.util.Scanner;
public class Java_recursion_addition {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int first_num = obj.nextInt();
        
        System.out.println("Enter second number");
        int second_num = obj.nextInt();

        System.out.println(sum(first_num,second_num));
        obj.close();
    }
    public static int sum(int a, int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else{
            return sum(--a,++b);
        }
    }
}
