package personal.ivan.leetcode;

public class LargestSubArray {

    public static int MaxSum(int[] nums)
    {
        int result = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }

        return result;
    }
}
