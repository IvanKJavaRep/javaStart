package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

public class SingleElementTest {
    @Test void test()
    {
        int[] arr = new int[] {1,1,2,5,2,3,3};
        System.out.println(SingleElement.singleNumber(arr));
    }
}
