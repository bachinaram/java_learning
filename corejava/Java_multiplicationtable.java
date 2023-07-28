import java.util.Scanner;
public class Java_multiplicationtable {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter some number:");
        int input = obj.nextInt();
        int i=1;
        do{
            System.out.println(input+" * "+i+" = "+input*i);
            i++;
        }
        while(i<=10);
    }
}
