package leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
public class majority_element {
    public static void main(String[] args){
        int[] nums = {1,1,0,0,0,1,1};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println("Majority element in the array is :"+ nums[n/2]);
    }
}

/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than n / 2 times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


 */