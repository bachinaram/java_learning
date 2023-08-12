package Arrays;
import java.util.Scanner;
public class Java_input_array {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int array_size = obj.nextInt();
        int[] arrayof_int =  new int[array_size];
        for(int i=0;i<array_size;i++){
            System.out.print("Enter "+i+"th element in the array: ");
            arrayof_int[i]=obj.nextInt();
        }

        for(int j:arrayof_int){
            System.out.print(j+" ");
        }
        System.out.println();
        obj.close();
    }
}
