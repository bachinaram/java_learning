package leetcode.sorting;

public class missing_number {
    public static void main(String[] args){
        int[] nums = {3,0,1};
        int output = find_missing_number(nums);
        System.out.println("Missing number is "+ output);
    }
    private static int find_missing_number(int[] nums){
        int n = nums.length;
        int total = (n*(n+1)/2);
        int subtotal=0;
        for(int i=0;i<n;i++){
            subtotal = subtotal+nums[i];
        }

        return total-subtotal;
    }
}
/*
 * public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int size = nums.length;
        if(nums[end]!=size){
            return size;
        }
        else if(nums[start]!=start){
            return start;
        }
        else if(size==1){
            if(nums[0]==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            while(start<end){
                if(nums[start]+1 != nums[start+1]){
                    return nums[start]+1;
                }
                else if(nums[end]-1!=nums[end-1]){
                    return nums[end]-1;
                }
                else{
                    start++;
                    end--;
                }
            }
        }
        return 100;

    }









    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

 */
