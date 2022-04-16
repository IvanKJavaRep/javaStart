package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    @Test void test()
    {
        int[] num = {1,2,3,4};
        int a = RemoveElement.RemoveElement1(num,1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
