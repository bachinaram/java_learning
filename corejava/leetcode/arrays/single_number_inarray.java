package leetcode.arrays;

public class single_number_inarray {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];
        } 
        return result;
     }
}

/* xor 

^ | 0 1      ^ | F T
--+-----     --+-----
0 | 0 1      F | F T
1 | 1 0      T | T F

0 xor anynumber = anynumber
e.g., 
0 xor 2  = 2
0 xor 5 = 5

xor same number is zero
5 xor 5 = 0
8 xor 8 = 0




 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1

 

Constraints:

    1 <= nums.length <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.


 */