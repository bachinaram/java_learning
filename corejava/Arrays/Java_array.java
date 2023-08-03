package Arrays;
public class Java_array {
    public static void main(String[] args){
        int num_array[]={10,30,45,99};
        System.out.println("Printing arrays");
        for(int i:num_array){
            System.out.print(i+" ");
        }
        System.out.println("\n"+"Printing arrays completed");

        System.out.println("Printing arrays in other approach");
        for(int i=0;i<num_array.length;i++){
            System.out.print(num_array[i]+" ");
        }
        System.out.println("\n"+"Printing arrays completed");

        char[] char_array={'a','A','R','u','s'}; 
        System.out.println("Printing char arrays");
        for(char c:char_array){
            System.out.print(c+" ");
        }
        System.out.println("\n"+"Printing char arrays completed");


        String[] str_array={"arush","Arvesh","Rakes","uoune","san diego"}; 
        System.out.println("Printing String arrays");
        for(String s:str_array){
            System.out.print(s+" ");
        }
        System.out.println("\n"+"Printing String arrays completed");

    }    
}
