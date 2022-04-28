package personal.ivan.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i]))
            {
                m.replace(nums[i], m.get(nums[i])+1);
            }
            else
            {
                m.put(nums[i],1);
            }
        }
        int key=0;
        int value=0;
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue()>value)
            {
                value=entry.getValue();
                key=entry.getKey();
            }
        }
        /*Object[] arr1 = (m.values()).toArray();
        Arrays.sort(arr1);*/
        return key;
    }
}
