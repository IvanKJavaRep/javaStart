package personal.ivan.leetcode;

import java.util.ArrayList;

public class RemoveElement {
    public static int RemoveElement1(int[] num, int val)
    {
        int s=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=val)
            {
                num[s++]=num[i];
            }
        }
        return s;
    }
}
