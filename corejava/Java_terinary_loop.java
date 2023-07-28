public class Java_terinary_loop {
    public static void main(String args[]){
        int num1=10,num2=15,num3=25;
        int result = (num1>=num2)?((num1>=num3)?num1:num3):((num2>=num3)?num2:num3);
        System.out.println(result + " is the largest number");
    }
}
