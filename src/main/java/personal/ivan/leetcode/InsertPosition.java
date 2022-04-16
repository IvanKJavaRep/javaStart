package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class InsertPosition {

    public static int Search(int[] nums, int target) {
        int i=0;
        for(i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }else if(target < nums[i]){
                return i;
            }
            System.out.println(i);
        }
        System.out.println(i);
        return i;
    }

}
