package practice;

public class move_zero_without_array {
    public static void move_zero(int[] nums){
        int temp = 0;
        int left_pointer = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp = nums[i];
                nums[i]=nums[left_pointer];
                nums[left_pointer]=temp;
                left_pointer++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {1,0,30,56,0,120,0,0};
         move_zero(nums);
        
    }
}

