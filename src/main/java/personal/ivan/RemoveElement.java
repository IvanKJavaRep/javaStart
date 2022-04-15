package personal.ivan;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        //System.out.println(num[2]);
        int a = RemoveElement1(num,1);
        //System.out.println(a);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


    }
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
