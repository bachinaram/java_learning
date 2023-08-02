import java.util.Scanner;
public class Java_recursion_fact2 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number to find factorial: ");
        int n = obj.nextInt();
        System.out.println(fact(n));
        obj.close();
    }

    public static int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }    
    }
}
