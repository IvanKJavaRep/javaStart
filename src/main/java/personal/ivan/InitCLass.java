package personal.ivan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class InitCLass {
    public static void main(String[] args) {
        int[] nums = {1,1,2,7};
        System.out.println(RemoveDupl(nums));

    }
    public static int RemoveDupl(int[] nums)
    {
        ArrayList<Integer> lst =new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] != nums[i + 1])
                    lst.add(nums[i]);
        }
        lst.add(nums[nums.length-1]);
        for (int i = 0; i < lst.size(); i++) {
            nums[i] = lst.get(i);
        }
        return lst.size();

    }
}
