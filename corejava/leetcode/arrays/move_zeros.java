package leetcode.arrays;

public class move_zeros {
    public static void moveZeros(int[] nums) {
        int left_pointer = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[left_pointer];
                nums[left_pointer] = temp;
                left_pointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original Array: " + arrayToString(nums));

        moveZeros(nums);

        System.out.println("Array after moving zeros to the end: " + arrayToString(nums));
    }

    private static String arrayToString(int[] nums) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            result.append(nums[i]);
            if (i < nums.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
/*
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

 
 */