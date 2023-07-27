public class Java_preincnpostinc {
    public static void main(String args[]){
        int num1=5,num2=5;
        int temp1=num1++;
        System.out.println(temp1 + " Even temp is assigned with post inc value of num1 but before compuations value is added");
        System.out.println(num1 + " We can clearly see the num1 value which is incremented by 1 here in this line");

        int temp2=++num2;
        System.out.println(temp2);
        System.out.println(num2);
    }
}
