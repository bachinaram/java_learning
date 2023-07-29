import java.util.Scanner;
public class Java_fibonacci{
    public static void main(String args[]){
        int init_num=0, prev_num=1;
        int next_num;
        System.out.println("Enter total count of fibonacci numbers you want");
        Scanner obj=new Scanner(System.in);
        int count = obj.nextInt();
        System.out.println(init_num);
        for(int i=1;i<count;i++){
            next_num=init_num+prev_num;
            init_num=prev_num;
            prev_num=next_num;
            System.out.println(next_num);
        }
    }
}