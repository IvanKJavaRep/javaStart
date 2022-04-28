package personal.ivan.leetcode;

import java.util.Arrays;

public class SearchInArrayII {
    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, target));
        int ind = Arrays.binarySearch(nums, target);
        if (ind >= 0 && ind != nums.length) {
            return true;
        }
        return false;
    }
}
