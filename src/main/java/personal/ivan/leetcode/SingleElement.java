package personal.ivan.leetcode;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleElement {
    public static int singleNumber(int[] nums) {

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result=result^nums[i];
        }
        return result;
        /*Hashtable<Integer,Integer> htable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(htable.containsKey(nums[i]))
            {
                htable.put(nums[i], htable.get(nums[i])+1);
            }
            else
            {
                htable.put(nums[i], 1);
            }
        }
        Enumeration<Integer> e = htable.keys();
        while(e.hasMoreElements())
        {
            int value = e.nextElement();
            if(htable.get(value)==1)
            {
                return value;
            }
        }
        return 0;*/
    }
}
