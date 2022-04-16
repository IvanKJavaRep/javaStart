package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

public class LargestSubArrayTest {
    @Test
    void test()
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(LargestSubArray.MaxSum(nums));
    }
}
