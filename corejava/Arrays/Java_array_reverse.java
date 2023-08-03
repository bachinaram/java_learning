package Arrays;

public class Java_array_reverse {
    public static void main(String[] args){
        int[] array_int = {99,88,33,55};
        System.out.println("Printed array in normal order");
        for(int k:array_int){
            System.out.print(k+" ");
        }
        System.out.println("Printed array in reverse order");
        for(int i=array_int.length-1;i>=0;i--){
            System.out.print(array_int[i]+" ");
        }
    }
}
