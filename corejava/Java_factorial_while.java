import java.util.Scanner;
class Java_factorial_while{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Factorial Number");
        int fact = input.nextInt();
        int result = 1;
        System.out.print("Factorial of " + fact +" is: ");
        do{
            result = result * fact; 
            fact--;
        }
        while(fact>=1);
        System.out.println(result);
        input.close();
    }
}