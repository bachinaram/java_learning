package leetcode.arrays;

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
/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.




nput: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
 */