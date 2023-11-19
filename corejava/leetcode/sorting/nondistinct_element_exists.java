package leetcode.sorting;

import java.util.Arrays;
import java.util.HashSet;

public class nondistinct_element_exists {
    public static boolean find_duplicate_exists(int[] nums){
        if(nums.length > 1){
            HashSet<Integer> myset = new HashSet();
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(!myset.add(nums[i])){
                    return true;
                }
            }
        }
        else{
            return false;
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        boolean exists = find_duplicate_exists(nums);
        System.out.println(exists);
    }
}
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 

Constraints:

    1 <= nums.length <= 105
    -109 <= nums[i] <= 109


 */