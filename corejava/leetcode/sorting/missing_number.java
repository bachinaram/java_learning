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
