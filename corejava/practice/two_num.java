package practice;
import java.util.HashMap;
public class two_num {
    public static int[] two_num_index(int[] xyz,int dest){
        int output[] = {};
        HashMap<Integer,Integer> my_dict = new HashMap<>();
        //2,7,11,15 //target
        int support = 0;
        for(int i=0;i<xyz.length;i++){
            support = dest - xyz[i];
            if(my_dict.containsKey(support)){
                return new int[]{my_dict.get(support),i};
            }
            
            my_dict.put(xyz[i],i);
        }
//i=0
//0<4 ->9-2=7 support=7 {2:0,}
//1< ->9-7=2 support=2 {yes}
        return output;
    }
    public static void main(String[] args){
        int[] nums={2,7,15,11}; // question part
        int target = 9; //question part

        int[] result = two_num_index(nums,target); //[0,1]

        for(int x: result){
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}
