package practice;

import java.util.ArrayList;

public class element_remove {
    public static ArrayList<Integer> remove_element(int[] nums,int val){
        ArrayList<Integer> out = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                out.add(nums[i]);
            }
        }
        return out;
    }
    public static void main(String[] args){
        int[] nums ={2,2,3,4,56,76,2,3};
        int value = 3;
        ArrayList<Integer> output = remove_element(nums,value);
        System.out.println(output.size());
    }
}
