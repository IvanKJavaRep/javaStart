package personal.ivan.leetcode;

import org.junit.jupiter.api.Test;

public class PlusOneTest {
    @Test void test()
    {
        int[] arr = {9, 9, 9, 9};
        for (var g : PlusOne.plusOne(arr)
        ) {
            System.out.println(g);
        }
    }
}
